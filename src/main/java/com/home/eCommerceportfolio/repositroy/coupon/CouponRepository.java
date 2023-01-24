package com.home.eCommerceportfolio.repositroy.coupon;

import com.home.eCommerceportfolio.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRepository extends JpaRepository<Coupon,Long>, CouponRepositorySupport {
}
