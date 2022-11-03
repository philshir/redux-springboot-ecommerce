package com.reduxtravelerspringboot.ecommerce.dao;

import com.reduxtravelerspringboot.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(String theEmail);
}
