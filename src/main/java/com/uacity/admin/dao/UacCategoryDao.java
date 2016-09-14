package com.uacity.admin.dao;

import com.uacity.admin.domain.UacCategoryEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by eegijmc on 7/26/2016.
 */
public interface UacCategoryDao extends JpaRepository<UacCategoryEntity, Long> {

    @Override
    Page<UacCategoryEntity> findAll(Pageable pageable);
}
