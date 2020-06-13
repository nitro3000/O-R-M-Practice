package com.go2it.ormpractice.service;

import com.go2it.ormpractice.entity.Payment;

import java.util.List;
import java.util.Optional;

public interface IPaymentService {
    Optional<Payment> findById(long id);

    void save(Payment p);
}
