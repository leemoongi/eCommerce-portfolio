package com.home.eCommerceportfolio.repositroy.inquiry;

import com.home.eCommerceportfolio.entity.Inquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InquiryRepository extends JpaRepository<Inquiry,Long>, InquiryRepositorySupport {
}
