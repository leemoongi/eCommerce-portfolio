package com.home.eCommerceportfolio.repositroy.orderDetail;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderDetailRepositorySupportImpl implements OrderDetailRepositorySupport {

    private final JPAQueryFactory queryFactory;
}
