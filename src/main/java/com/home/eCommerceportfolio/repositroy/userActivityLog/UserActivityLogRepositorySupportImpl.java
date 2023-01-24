package com.home.eCommerceportfolio.repositroy.userActivityLog;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserActivityLogRepositorySupportImpl implements UserActivityLogRepositorySupport {

    private final JPAQueryFactory queryFactory;
}
