package com.go2it.ormpractice.service;

import com.go2it.ormpractice.entity.Customer;

import java.util.List;

public interface ICustomerService {

    public Customer findById(int id);
    public void save(Customer customer);
    public boolean remove(int id);
    public boolean remove(Customer customer);
    public boolean updateCcNo(int id, String ccNo);
    public List<String> getNamesBySumPaid(double sumPaid);
}
