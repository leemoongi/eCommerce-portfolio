package com.home.eCommerceportfolio.repositroy.coupon;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CouponRepositorySupportImpl implements CouponRepositorySupport {

    private final JPAQueryFactory queryFactory;
}
