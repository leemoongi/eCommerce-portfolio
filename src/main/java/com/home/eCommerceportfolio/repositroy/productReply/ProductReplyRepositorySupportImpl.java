package com.home.eCommerceportfolio.repositroy.productReply;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductReplyRepositorySupportImpl implements ProductReplyRepositorySupport {

    private final JPAQueryFactory queryFactory;
}
