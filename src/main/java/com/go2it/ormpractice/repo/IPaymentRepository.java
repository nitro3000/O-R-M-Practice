package com.go2it.ormpractice.repo;

import com.go2it.ormpractice.entity.Merchant;
import com.go2it.ormpractice.entity.Payment;

public interface IPaymentRepository {
    public Payment findById(int id);
    public Payment findByName(String name);
    public void save (Payment payment);
}
