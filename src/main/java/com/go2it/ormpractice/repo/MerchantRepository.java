package com.go2it.ormpractice.repo;

import com.go2it.ormpractice.entity.Merchant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository // available to hibernate and show that this is bean in spring witch work with DB
public class MerchantRepository implements IMerchantRepository{

    private final Logger logger = LoggerFactory.getLogger(MerchantRepository.class);

    @PersistenceContext  // same as @Autowired
    private EntityManager em;

    public Merchant findById(int id) {
        Merchant m = em.find(Merchant.class, id); // mapping for em (JPA method .find)
        return m;
    }
}
