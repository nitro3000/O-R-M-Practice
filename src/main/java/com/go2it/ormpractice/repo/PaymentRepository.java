package com.go2it.ormpractice.repo;

import com.go2it.ormpractice.entity.Payment;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;


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

    @Override
    public double getPaymentsSum() {
        TypedQuery<Double>query=em.createQuery ("SELECT SUM(p.sumPaid)FROM payment p", Double.class);
        return query.getSingleResult ();
    }

    @Override
    //-- example with named Parameter : ("limit" , limit)                       [:limit]
    public List<Payment> getLargePayments(double limit) {
        String queryTxt="SELECT p FROM payment p WHERE p.sumPaid>:limit";
        TypedQuery<Payment>query=em.createQuery (queryTxt,Payment.class);
        query.setParameter ("limit", limit);
        return query.getResultList ();
    }
    //--example with numbered parameter :(1,limit)                 [?]
//    public List<Payment> getLargePayments(double limit) {
//        TypedQuery<Payment>query=em.createQuery ("SELECT p FROM payment p WHERE p.sumPaid>?1",Payment.class);
//        query.setParameter (1, limit);
//        return query.getResultList ();
//    }

}
