package com.home.eCommerceportfolio.repositroy.productReply;

import com.home.eCommerceportfolio.entity.ProductReply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductReplyRepository extends JpaRepository<ProductReply,Long>, ProductReplyRepositorySupport {
}
