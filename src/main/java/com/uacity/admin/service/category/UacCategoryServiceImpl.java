package com.uacity.admin.service.category;

import com.uacity.admin.common.util.SystemConstant;
import com.uacity.admin.dao.UacCategoryDao;
import com.uacity.admin.domain.UacCategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by eegijmc on 7/26/2016.
 */
@Service("uacCategoryService")
public class UacCategoryServiceImpl implements UacCategoryService {

    @Autowired
    private UacCategoryDao dao;

    @Override
    public void save(UacCategoryEntity categoryEntity) {
        dao.save(categoryEntity);
    }

    @Override
    public void delete(long id) {
        dao.delete(id);
    }

    @Override
    public List<UacCategoryEntity> getAll() {
        return dao.findAll();
    }

    @Override
    public Page<UacCategoryEntity> search(String name, boolean valid, int page) {
        Pageable pa = new PageRequest(page, SystemConstant.pageSize);
        return dao.findAll(pa);
    }

    @Override
    public UacCategoryEntity getById(Long id) {
        return dao.getOne(id);
    }

}
