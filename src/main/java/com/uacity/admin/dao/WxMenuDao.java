package com.uacity.admin.dao;

import com.uacity.admin.domain.WxMenu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by eegijmc on 7/11/2016.
 */
public interface WxMenuDao extends JpaRepository<WxMenu, Integer> {

    public Page<WxMenu> findByNameContainingAndTypeContainingAndStatusOrderByNum(String name, String type, int status, Pageable pageable);

}
