package com.home.eCommerceportfolio.repositroy.inquiry;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class InquiryRepositorySupportImpl implements InquiryRepositorySupport {

    private final JPAQueryFactory queryFactory;
}
