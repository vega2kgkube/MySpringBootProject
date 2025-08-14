package com.rookies4.myspringboot.repository;

import com.rookies4.myspringboot.entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
//assertj 라이브러리의 Assertions 클래스
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CustomerRepositoryTest {
    @Autowired
    CustomerRepository customerRepository;

    @Test
    void testSaveCustomer() {
        //Given (준비단계)
        Customer customer = new Customer();
        customer.setCustomerId("AC001");
        customer.setCustomerName("스프링부트");
        //When (실행단계)
        Customer savedCustomer = customerRepository.save(customer);
        //Then (검증단계)
        //등록된 Customer 엔티티객체가 Null이 아닌지를 검증하기
        assertThat(savedCustomer).isNotNull();
    }

}