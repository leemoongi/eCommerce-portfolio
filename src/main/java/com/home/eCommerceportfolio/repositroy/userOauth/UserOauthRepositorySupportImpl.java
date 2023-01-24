package com.home.eCommerceportfolio.repositroy.userOauth;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserOauthRepositorySupportImpl implements UserOauthRepositorySupport {

    private final JPAQueryFactory queryFactory;
}
