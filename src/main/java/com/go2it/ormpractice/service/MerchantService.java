package com.go2it.ormpractice.service;

import com.go2it.ormpractice.entity.Merchant;
import com.go2it.ormpractice.repo.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // without @Service Spring will not inject bean. (Spring inject only classes that managed by Spring)
public class MerchantService implements IMerchantService{
    @Autowired // add bean merchantRepository to @Service
    private MerchantRepository merchantRepository;

    public Merchant findById(int id) {
        return merchantRepository.findById (id);
    }
}
