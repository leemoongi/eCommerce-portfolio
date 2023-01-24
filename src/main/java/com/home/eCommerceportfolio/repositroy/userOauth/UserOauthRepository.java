package com.home.eCommerceportfolio.repositroy.userOauth;

import com.home.eCommerceportfolio.entity.UserOauth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserOauthRepository extends JpaRepository<UserOauth,Long>, UserOauthRepositorySupport {
}
