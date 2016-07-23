package com.uacity.admin.service.shopType;

import com.uacity.admin.domain.UacShopTypeEntity;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by eegijmc on 7/19/2016.
 */
public interface UacShopTypeService {

    void save(UacShopTypeEntity shopType);

    void delete(int id);

    List<UacShopTypeEntity> getAll();

    Page<UacShopTypeEntity> search(String name, boolean top, int page);

    UacShopTypeEntity getById(Integer id);
}
