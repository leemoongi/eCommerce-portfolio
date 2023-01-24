package com.home.eCommerceportfolio.repositroy.productReport;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductReportRepositorySupportImpl implements ProductReportRepositorySupport {

    private final JPAQueryFactory queryFactory;
}
