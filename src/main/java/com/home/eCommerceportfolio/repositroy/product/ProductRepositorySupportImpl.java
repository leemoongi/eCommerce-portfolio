package com.home.eCommerceportfolio.repositroy.product;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductRepositorySupportImpl implements ProductRepositorySupport {

    private final JPAQueryFactory queryFactory;
}
