package com.go2it.ormpractice.repo;

import com.go2it.ormpractice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {


}
