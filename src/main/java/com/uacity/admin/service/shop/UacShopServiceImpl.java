package com.uacity.admin.service.shop;

import com.uacity.admin.common.util.SystemConstant;
import com.uacity.admin.dao.UacShopDao;
import com.uacity.admin.domain.UacShopEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by eegijmc on 7/19/2016.
 */
@Service("uacShopService")
public class UacShopServiceImpl implements UacShopService {

    @Autowired
    private UacShopDao dao;

    @Override
    public void save(UacShopEntity entity) {
        dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public Page<UacShopEntity> search(String name, int page) {
        Pageable pa = new PageRequest(page, SystemConstant.pageSize);
        return dao.findByNameContainingOrderByNum(name, pa);
    }

    @Override
    public UacShopEntity getById(Long id) {
        return dao.getOne(id);
    }
}
