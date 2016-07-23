package com.uacity.admin.service.shop;

import com.uacity.admin.domain.UacShopEntity;
import org.springframework.data.domain.Page;

/**
 * Created by eegijmc on 7/19/2016.
 */
public interface UacShopService {

    void save(UacShopEntity entity);

    void delete(Long id);

    Page<UacShopEntity> search(String name, int page);

    UacShopEntity getById(Long id);
}
