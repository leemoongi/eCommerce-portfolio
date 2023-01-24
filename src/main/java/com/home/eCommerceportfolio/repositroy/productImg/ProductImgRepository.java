package com.home.eCommerceportfolio.repositroy.productImg;

import com.home.eCommerceportfolio.entity.ProductImg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductImgRepository extends JpaRepository<ProductImg,Long>, ProductImgRepositorySupport {
}
