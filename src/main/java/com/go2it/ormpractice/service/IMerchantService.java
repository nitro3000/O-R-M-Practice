package com.go2it.ormpractice.service;

import com.go2it.ormpractice.entity.Merchant;
import com.go2it.ormpractice.entity.dto.Result;

import java.util.List;

public interface IMerchantService {
    public Merchant findById(int id);
    public List<Result> getTotalReport();
    public List<Merchant>getSortedByNeedToPay();
    public void save(Merchant merchant);
}
