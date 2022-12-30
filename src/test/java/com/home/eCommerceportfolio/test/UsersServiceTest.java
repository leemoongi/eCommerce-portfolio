package com.home.eCommerceportfolio.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class UsersServiceTest {

    @Autowired
    private UsersService usersService;

    @Autowired
    private UsersRepository usersRepository;

    @BeforeEach
    public void setUp() {
        Users users = getUsers();
        usersRepository.save(users);
    }

    @Test
    void querydsl() {
        Users findUser = usersService.userSearch_queryDsl("이문기");
        assertThat(findUser.getPassword()).isEqualTo("asdf1234");
    }

    @Test
    void springDataJap() {
        Users findUser = usersService.userSearch_jpa("이문기");
        assertThat(findUser.getPassword()).isEqualTo("asdf1234");
    }

    private static Users getUsers() {
        Users users = new Users();
        users.setNormalId("이문기");
        users.setPassword("asdf1234");
        return users;
    }


}
