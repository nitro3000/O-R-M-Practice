package com.go2it.ormpractice.repo;

import com.go2it.ormpractice.entity.Merchant;

public interface IMerchantRepository {
    public Merchant findById(int id);
}
