package com.home.eCommerceportfolio.repositroy.user;

import com.home.eCommerceportfolio.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>, UserRepositorySupport {
}
