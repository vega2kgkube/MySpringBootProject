package com.rookies4.myspringboot.repository;

import com.rookies4.myspringboot.entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

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
    }

}