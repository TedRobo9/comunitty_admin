package com.uacity.admin.dao;

import com.uacity.admin.domain.UacShopTypeEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by eegijmc on 7/19/2016.
 */
public interface UacShopTypeDao extends JpaRepository<UacShopTypeEntity, Integer> {

    public Page<UacShopTypeEntity> findByNameContainingAndTopOrderByNum(String name, boolean top, Pageable pageable);

}
