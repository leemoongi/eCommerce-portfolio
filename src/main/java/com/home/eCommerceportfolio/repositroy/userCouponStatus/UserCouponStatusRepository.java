package com.home.eCommerceportfolio.repositroy.userCouponStatus;

import com.home.eCommerceportfolio.entity.UserCouponStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCouponStatusRepository extends JpaRepository<UserCouponStatus,Long>, UserCouponStatusRepositorySupport {
}
