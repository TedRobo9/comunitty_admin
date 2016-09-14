package com.uacity.admin.service.category;

import com.uacity.admin.domain.UacCategoryEntity;
import com.uacity.admin.domain.UacShopTypeEntity;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by eegijmc on 7/26/2016.
 */
public interface UacCategoryService {

    void save(UacCategoryEntity shopType);

    void delete(long id);

    List<UacCategoryEntity> getAll();

    Page<UacCategoryEntity> search(String name, boolean valid, int page);

    UacCategoryEntity getById(Long id);
}
