package com.go2it.ormpractice.service;

import com.go2it.ormpractice.entity.Payment;
import com.go2it.ormpractice.repo.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service // without @Service Spring will not inject bean. (Spring inject only classes that managed by Spring)
public class PaymentService implements IPaymentService{
    @Autowired // add bean merchantRepository to @Service
    private PaymentRepository paymentRepository;

    @Override
    public Payment findById(int id) {
        return paymentRepository.findById (id);
    }

    @Override
    public Payment findByName(String name) {
        return paymentRepository.findByName (name);
    }

    @Override
    public void save(Payment payment) {
        paymentRepository.save (payment);
    }


}
