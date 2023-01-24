package com.home.eCommerceportfolio.repositroy.product;

import com.home.eCommerceportfolio.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>, ProductRepositorySupport {
}
