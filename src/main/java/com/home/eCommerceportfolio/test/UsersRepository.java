package com.home.eCommerceportfolio.test;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long>, UsersRepositorySupport {

    Users findByNormalId(String normalId);

}
