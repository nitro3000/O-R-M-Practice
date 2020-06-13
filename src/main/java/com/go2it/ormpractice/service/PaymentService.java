package com.go2it.ormpractice.service;

import com.go2it.ormpractice.entity.Payment;
import com.go2it.ormpractice.repo.IPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service // without @Service Spring will not inject bean. (Spring inject only classes that managed by Spring)
public class PaymentService implements IPaymentService {
    @Autowired
    private IPaymentRepository paymentRepository;

    @Override
    public Optional<Payment> findById(long id) {
        return paymentRepository.findById (id);
    }

    @Override
    public void save(Payment p) {
        paymentRepository.save (p);
    }
}
