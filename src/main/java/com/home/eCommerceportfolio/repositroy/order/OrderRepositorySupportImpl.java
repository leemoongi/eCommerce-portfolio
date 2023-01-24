package com.home.eCommerceportfolio.repositroy.order;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderRepositorySupportImpl implements OrderRepositorySupport {

    private final JPAQueryFactory queryFactory;
}
