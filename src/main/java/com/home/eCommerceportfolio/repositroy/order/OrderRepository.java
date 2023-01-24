package com.home.eCommerceportfolio.repositroy.order;

import com.home.eCommerceportfolio.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long>, OrderRepositorySupport {
}
