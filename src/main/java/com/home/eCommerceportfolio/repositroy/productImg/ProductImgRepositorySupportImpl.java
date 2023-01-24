package com.home.eCommerceportfolio.repositroy.productImg;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductImgRepositorySupportImpl implements ProductImgRepositorySupport {

    private final JPAQueryFactory queryFactory;
}
