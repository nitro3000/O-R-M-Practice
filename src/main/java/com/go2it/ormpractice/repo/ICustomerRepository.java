package com.go2it.ormpractice.repo;

import com.go2it.ormpractice.entity.Customer;

public interface ICustomerRepository {

    public Customer findById(int id);
    public void save(Customer customer);
    public boolean remove(int id);
    public boolean remove(Customer customer);
}
