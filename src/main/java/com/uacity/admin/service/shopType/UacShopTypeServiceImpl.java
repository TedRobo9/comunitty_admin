package com.uacity.admin.service.shopType;

import com.uacity.admin.common.util.SystemConstant;
import com.uacity.admin.dao.UacShopTypeDao;
import com.uacity.admin.domain.UacShopTypeEntity;
import com.uacity.admin.domain.WxMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by eegijmc on 7/19/2016.
 */
@Service("uacShopTypeService")
public class UacShopTypeServiceImpl implements UacShopTypeService {

    @Autowired
    private UacShopTypeDao dao;

    @Override
    public void save(UacShopTypeEntity shopType) {
        dao.save(shopType);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }

    @Override
    public List<UacShopTypeEntity> getAll() {
        return dao.findAll();
    }

    @Override
    public Page<UacShopTypeEntity> search(String name, boolean top, int page) {
        Pageable pa = new PageRequest(page, SystemConstant.pageSize);
        return dao.findByNameContainingAndTopOrderByNum(name, top, pa);
    }

    @Override
    public UacShopTypeEntity getById(Integer id) {
        return dao.getOne(id);
    }
}
