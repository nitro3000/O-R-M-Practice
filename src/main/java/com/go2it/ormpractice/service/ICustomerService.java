package com.go2it.ormpractice.service;

import com.go2it.ormpractice.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    public Optional<Customer> findById(long id);


}
