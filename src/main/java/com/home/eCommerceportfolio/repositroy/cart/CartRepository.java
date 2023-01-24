package com.home.eCommerceportfolio.repositroy.cart;

import com.home.eCommerceportfolio.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long>, CartRepositorySupport {
}
