package com.home.eCommerceportfolio.repositroy.productCategory;

import com.home.eCommerceportfolio.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,String>, ProductCategoryRepositorySupport {
}
