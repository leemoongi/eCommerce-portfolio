package com.home.eCommerceportfolio.test;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static com.home.eCommerceportfolio.test.QUsers.users;

@Repository
@RequiredArgsConstructor
public class UsersRepositorySupportImpl implements UsersRepositorySupport{

    private final JPAQueryFactory query;

    @Override
    public Users select_querydsl(String normalId) {
        return query
                .selectFrom(users)
                .where(users.normalId.eq(normalId))
                .fetchOne();
    }
}
