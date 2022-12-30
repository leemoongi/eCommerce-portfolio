package com.home.eCommerceportfolio.test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final UsersRepository usersRepository;

    public Users userSearch_jpa(String NormalId) {
        return usersRepository.findByNormalId(NormalId);
    }

    public Users userSearch_queryDsl(String NormalId) {
        return usersRepository.select_querydsl(NormalId);
    }

}
