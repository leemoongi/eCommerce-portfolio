package com.home.eCommerceportfolio.repositroy.productColor;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductColorRepositorySupportImpl implements ProductColorRepositorySupport {

    private final JPAQueryFactory queryFactory;
}
