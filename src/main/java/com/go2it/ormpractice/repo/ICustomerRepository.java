package com.go2it.ormpractice.repo;

import com.go2it.ormpractice.entity.Customer;

import java.util.List;

public interface ICustomerRepository {

    public Customer findById(int id);
    public void save(Customer customer);
    public boolean remove(int id);
    public boolean remove(Customer customer);
    public boolean update(Customer customerToUpdate);
    public List<String>getNamesBySumPaid(double sumPaid);
}
