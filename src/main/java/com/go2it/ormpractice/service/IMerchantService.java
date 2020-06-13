package com.go2it.ormpractice.service;

import com.go2it.ormpractice.entity.Merchant;
import com.go2it.ormpractice.entity.dto.Result;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface IMerchantService {
    Optional<Merchant> findById(long id);

    void save(Merchant merchant);

    public List<Merchant> findAllByOrderByNeedToSend();
    public List<Result> getTotalReport();

}
