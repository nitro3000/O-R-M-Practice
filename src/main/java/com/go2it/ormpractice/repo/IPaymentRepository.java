package com.go2it.ormpractice.repo;

import com.go2it.ormpractice.entity.Merchant;
import com.go2it.ormpractice.entity.Payment;

import java.util.List;

public interface IPaymentRepository {
    public Payment findById(int id);
    public Payment findByName(String name);
    public void save (Payment payment);
    public double getPaymentsSum();
    public List<Payment>getLargePayments(double limit);
}
