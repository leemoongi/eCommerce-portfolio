package com.home.eCommerceportfolio.test;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@RestController
@RequiredArgsConstructor
@Transactional
public class Controller {

    @PersistenceContext
    EntityManager em;

    @GetMapping("/user")
    public Users test1() {
        Users users = new Users();
        users.setNormalId("이문기");
        users.setPassword("1234");
        return users;
    }

    @GetMapping("/user/insert")
    public void test2() {
        Users users = new Users();
        users.setNormalId("이문기");
        users.setPassword("1234");

        em.persist(users);
    }

    @GetMapping("/user/select")
    public Users test3() {
        Users users = em.find(Users.class, 1L);
        return users;
    }

}
