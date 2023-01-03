package com.home.eCommerceportfolio.user;

import com.home.eCommerceportfolio.domain.user.User;
import com.home.eCommerceportfolio.domain.user.UsersService;
import com.home.eCommerceportfolio.domain.user.repositroy.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class UserServiceTest {

    @Autowired
    private UsersService usersService;

    @Autowired
    private UserRepository userRepository;

    @BeforeEach
    public void setUp() {
        User user = getUsers();
        userRepository.save(user);
    }

    @Test
    void querydsl() {
        User findUser = usersService.userSearch_queryDsl("이문기");
        assertThat(findUser.getPassword()).isEqualTo("asdf1234");
    }

    @Test
    void springDataJap() {
        User findUser = usersService.userSearch_jpa("이문기");
        assertThat(findUser.getPassword()).isEqualTo("asdf1234");
    }

    private static User getUsers() {
        User user = new User();
        user.setNormalId("이문기");
        user.setPassword("asdf1234");
        return user;
    }


}
