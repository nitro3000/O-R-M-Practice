package com.go2it.ormpractice.service;

import com.go2it.ormpractice.entity.Customer;

public interface ICustomerService {

    public Customer findById(int id);
    public void save(Customer customer);
    public boolean remove(int id);
    public boolean remove(Customer customer);
    public boolean updateCcNo(int id, String ccNo);
}
