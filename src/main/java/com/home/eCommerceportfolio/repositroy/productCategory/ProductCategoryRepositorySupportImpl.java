package com.home.eCommerceportfolio.repositroy.productCategory;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductCategoryRepositorySupportImpl implements ProductCategoryRepositorySupport {

    private final JPAQueryFactory queryFactory;
}
