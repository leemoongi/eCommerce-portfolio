package com.home.eCommerceportfolio.repositroy.productColor;

import com.home.eCommerceportfolio.entity.ProductColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductColorRepository extends JpaRepository<ProductColor,Long>, ProductColorRepositorySupport {
}
