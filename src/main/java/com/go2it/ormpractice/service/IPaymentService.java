package com.go2it.ormpractice.service;

import com.go2it.ormpractice.entity.Payment;

public interface IPaymentService {
    public Payment findById(int id);
    public Payment findByName(String name);
    public void save(Payment payment);

}
