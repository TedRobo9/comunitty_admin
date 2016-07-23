package com.uacity.admin.dao;

import com.uacity.admin.domain.UacShopEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by eegijmc on 7/19/2016.
 */
public interface UacShopDao extends JpaRepository<UacShopEntity, Long> {

    public Page<UacShopEntity> findByNameContainingOrderByNum(String name, Pageable pageable);
}
