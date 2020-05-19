package com.go2it.ormpractice.service;

import com.go2it.ormpractice.entity.Merchant;
import com.go2it.ormpractice.entity.dto.Result;
import com.go2it.ormpractice.repo.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service // without @Service Spring will not inject bean. (Spring inject only classes that managed by Spring)
public class MerchantService implements IMerchantService {

    @Autowired // add bean merchantRepository from @Repository to @Service
    private MerchantRepository merchantRepository;

    @Override
    public Merchant findById(int id) {
        return merchantRepository.findById (id);
    }

    @Override
    public List<Result> getTotalReport() {
        return merchantRepository.getTotalReport ( );
    }

    @Override
    public List<Merchant> getSortedByNeedToPay() {
        return merchantRepository.getSortedByNeedToPay ( );
    }

    @Override
    @Transactional
    public void save(Merchant merchant) {
        merchantRepository.save (merchant);

    }
}
