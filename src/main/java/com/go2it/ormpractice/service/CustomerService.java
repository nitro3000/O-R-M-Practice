package com.go2it.ormpractice.service;

import com.go2it.ormpractice.entity.Customer;
import com.go2it.ormpractice.repo.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    public Optional<Customer> findById(long id) {
        return customerRepository.findById (id);
    }


}
