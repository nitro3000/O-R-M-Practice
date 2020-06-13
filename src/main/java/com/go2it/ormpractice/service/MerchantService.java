package com.go2it.ormpractice.service;

import com.go2it.ormpractice.entity.Merchant;
import com.go2it.ormpractice.entity.dto.Result;
import com.go2it.ormpractice.repo.IMerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service // without @Service Spring will not inject bean. (Spring inject only classes that managed by Spring)
public class MerchantService implements IMerchantService {

    @Autowired // add bean merchantRepository from @Repository to @Service
    private IMerchantRepository merchantRepository;

    @Override
    public Optional<Merchant> findById(long id) {
        return merchantRepository.findById (id);
    }

    @Override
    //@Transactional
    public void save(Merchant merchant) {
        merchantRepository.save (merchant);
    }

    @Override
    public List<Merchant> findAllByOrderByNeedToSend() {
        return merchantRepository.findAllByOrderByNeedToSend ( );
    }

    @Override
    public List<Result> getTotalReport() {
        return merchantRepository.getTotalReport ( );
    }


//    @Override
//    public List<Merchant> findAll() {
//        return merchantRepository.findAll ( );
//    }


//    @Override
//    public List<Merchant> findAllByOrderByNeedToSend() {
//        return merchantRepository.findAllByOrderByNeedToSend ( );
//    }

//    @Override
//    public List<Merchant> getSortedByNeedToSend() {
//        return merchantRepository.getSortedByNeedToSend ( );
//    }

}
