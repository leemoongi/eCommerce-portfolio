package com.home.eCommerceportfolio.repositroy.userCouponStatus;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserCouponStatusRepositorySupportImpl implements UserCouponStatusRepositorySupport {

    private final JPAQueryFactory queryFactory;
}
