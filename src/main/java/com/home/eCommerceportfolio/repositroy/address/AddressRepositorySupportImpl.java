package com.home.eCommerceportfolio.repositroy.address;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AddressRepositorySupportImpl implements AddressRepositorySupport{

    private final JPAQueryFactory queryFactory;
}
