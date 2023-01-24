package com.home.eCommerceportfolio.repositroy.productReport;

import com.home.eCommerceportfolio.entity.ProductReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductReportRepository extends JpaRepository<ProductReport,Long>, ProductReportRepositorySupport {
}
