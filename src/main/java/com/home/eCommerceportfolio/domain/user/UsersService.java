package com.home.eCommerceportfolio.domain.user;

import com.home.eCommerceportfolio.domain.user.repositroy.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final UserRepository userRepository;

    public User userSearch_jpa(String NormalId) {
        return userRepository.findByNormalId(NormalId);
    }

    public User userSearch_queryDsl(String NormalId) {
        return userRepository.select_querydsl(NormalId);
    }

}
