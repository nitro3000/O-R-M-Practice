package com.go2it.ormpractice.repo;

import com.go2it.ormpractice.entity.Merchant;
import com.go2it.ormpractice.entity.dto.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository // available to hibernate and show that this is bean in spring witch work with DB
public class MerchantRepository implements IMerchantRepository {

    private final Logger logger = LoggerFactory.getLogger (MerchantRepository.class);

    @PersistenceContext  // same as @Autowired
    private EntityManager em;

    @Override
    public Merchant findById(int id) {
        Merchant m = em.find (Merchant.class, id); // mapping for em (JPA method .find)
        return m;
    }

    @Override
    public void save(Merchant merchant) {
        em.persist (merchant);
    }

    @Override
    public List<Result> getTotalReport() {
        String txt = "SELECT new com.go2it.ormpractice.entity.dto.Result(p.merchant.name,SUM(p.chargePaid),count(p))";
        txt += "FROM Payment p GROUP BY p.merchant.name";
        TypedQuery<Result> query = em.createQuery (txt, Result.class); // mapping for em (JPA method .getTotalReport)
        return query.getResultList ( );
    }

    @Override
    public List<Merchant> getSortedByNeedToPay() {
        String txt = "SELECT m FROM Merchant m ORDER BY m.needToSend";
        TypedQuery<Merchant> query = em.createQuery (txt, Merchant.class);
        return query.getResultList ( );
    }




}
