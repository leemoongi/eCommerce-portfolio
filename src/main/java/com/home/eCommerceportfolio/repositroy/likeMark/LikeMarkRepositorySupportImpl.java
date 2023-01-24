package com.home.eCommerceportfolio.repositroy.likeMark;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LikeMarkRepositorySupportImpl implements LikeMarkRepositorySupport {

    private final JPAQueryFactory queryFactory;
}
