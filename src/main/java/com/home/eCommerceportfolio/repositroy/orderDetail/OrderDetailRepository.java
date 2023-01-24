package com.home.eCommerceportfolio.repositroy.orderDetail;

import com.home.eCommerceportfolio.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail,Long>, OrderDetailRepositorySupport {
}
