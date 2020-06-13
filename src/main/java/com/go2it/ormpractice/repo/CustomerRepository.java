package com.go2it.ormpractice.repo;
//
//import com.go2it.ormpractice.entity.Customer;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;
//import java.util.List;
//
//@Repository
//public class CustomerRepository implements ICustomerRepository {
//
//    private final Logger logger = LoggerFactory.getLogger (CustomerRepository.class);
//
//    @PersistenceContext  // same as @Autowired
//    private EntityManager em;
//
//    @Override
//    public Customer findById(long id) {
//        Customer c = em.find (Customer.class, id);
//        return c;
//    }
//
//    @Override
//    public void save(Customer customer) {
//        em.persist (customer);
//    }
//
//    @Override
//    public boolean remove(long id) {
//        Customer customer = findById (id);
//        if (customer != null) {
//            em.remove (customer);
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public boolean remove(Customer customer) {
//        if (customer != null) {
//            em.remove (customer);
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public boolean update(Customer customerToUpdate) {
//        if (customerToUpdate != null) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    @Override
//    public List<String> getNamesBySumPaid(double sumPaid) {
//        String txt ="SELECT DISTINCT c.name FROM ";
//        txt+="payment p , customer c ";
//        txt+="WHERE c.id = p.customer AND p.sumPaid > " + sumPaid;// Entities here has to be exactly like in @Entity (name=...)
//        TypedQuery<String>query=em.createQuery (txt,String.class);
//        return query.getResultList ();
//    }
////    @Override
////    public boolean update(Customer customerToUpdate) {
////        if (customerToUpdate != null) {
////            em.persist (customerToUpdate);
////            return true;
////        } else {
////            return false;
////        }
////    }
//
//    public void merge(Customer customerToMerge) { //should be void or Customer type return?
//        if (customerToMerge != null) {
//            em.merge (customerToMerge);
//        } else System.out.println ("customer not exist");
//    }
//
//}
