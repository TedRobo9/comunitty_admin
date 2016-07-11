package com.uacity.admin.service.wxmenu;

import com.uacity.admin.domain.WxMenu;
import org.springframework.data.domain.Page;

/**
 * Created by eegijmc on 7/11/2016.
 */
public interface WxMenuService {

    void save(WxMenu wxMenu);

    void delete(int id);

    Page<WxMenu> search(String name, String type, int status, int page);

    WxMenu getById(Integer id);
}
