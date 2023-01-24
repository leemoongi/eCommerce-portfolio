package com.home.eCommerceportfolio.repositroy.cart;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CartRepositorySupportImpl implements CartRepositorySupport {

    private final JPAQueryFactory queryFactory;
}
