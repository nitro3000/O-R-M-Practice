package com.go2it.ormpractice.service;

import com.go2it.ormpractice.entity.Customer;
import com.go2it.ormpractice.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer findById(int id) {
        return customerRepository.findById (id);
    }

    @Transactional
    public void save(Customer customer) {
        customerRepository.save (customer);

    }

    @Transactional
    public boolean remove(int id) {
        return customerRepository.remove (id);
    }

    @Transactional
    public boolean remove(Customer customer) {
        return customerRepository.remove (customer);
    }
}
