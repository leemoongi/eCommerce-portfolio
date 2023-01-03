package com.home.eCommerceportfolio.domain.user.repositroy;

import com.home.eCommerceportfolio.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>, UserRepositorySupport {

    User findByNormalId(String normalId);

}
