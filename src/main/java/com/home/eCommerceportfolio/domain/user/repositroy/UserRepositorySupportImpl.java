package com.home.eCommerceportfolio.domain.user.repositroy;

import com.home.eCommerceportfolio.domain.user.User;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static com.home.eCommerceportfolio.user.QUsers.users;

@Repository
@RequiredArgsConstructor
public class UserRepositorySupportImpl implements UserRepositorySupport {

    private final JPAQueryFactory query;

    @Override
    public User select_querydsl(String normalId) {
        return query
                .selectFrom(users)
                .where(users.normalId.eq(normalId))
                .fetchOne();
    }
}
