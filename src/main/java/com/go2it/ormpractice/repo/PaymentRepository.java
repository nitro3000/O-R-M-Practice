package com.go2it.ormpractice.repo;

import com.go2it.ormpractice.entity.Payment;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
public class PaymentRepository implements IPaymentRepository {
    @PersistenceContext // same as @Autowired
    private EntityManager em;

    @Override
    public Payment findById(int id) {
        return em.find (Payment.class, id);
    }

    @Override
    public Payment findByName(String name) {
        return em.find (Payment.class, name);
    }

    @Override
    public void save(Payment payment) {em.persist (payment);

    }


}
