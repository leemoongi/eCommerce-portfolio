package com.home.eCommerceportfolio.repositroy.address;

import com.home.eCommerceportfolio.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long>, AddressRepositorySupport {

    Address findByDeliverAddress(String deliverAddress);
}
