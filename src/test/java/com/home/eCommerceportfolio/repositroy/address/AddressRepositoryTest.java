package com.home.eCommerceportfolio.repositroy.address;

import com.home.eCommerceportfolio.entity.Address;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class AddressRepositoryTest {

    @Autowired
    private AddressRepository addressRepository;

    @Test
    void 테스트 (){
        Address address = new Address();
        address.setDeliverAddress("테스트 주소");
        address.setBestFlag('Y');

        Address saveAddress = addressRepository.save(address);
        Address findAddress = addressRepository.findByDeliverAddress("테스트 주소");

        assertThat(saveAddress.getId()).isEqualTo(findAddress.getId());
    }


}
