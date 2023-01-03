package com.home.eCommerceportfolio.domain.user.repositroy;

import com.home.eCommerceportfolio.domain.user.User;

public interface UserRepositorySupport {

    User select_querydsl(String normalId);

}
