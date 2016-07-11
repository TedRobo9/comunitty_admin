package com.uacity.admin.service.wxmenu;

import com.uacity.admin.common.util.SystemConstant;
import com.uacity.admin.dao.WxMenuDao;
import com.uacity.admin.domain.WxMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by eegijmc on 7/11/2016.
 */
@Service("wxMenuService")
public class WxMenuServiceImpl implements WxMenuService {

    @Autowired
    private WxMenuDao dao;

    @Override
    public void save(WxMenu wxMenu) {
        dao.save(wxMenu);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }

    @Override
    public Page<WxMenu> search(String name, String type, int status, int page) {
        Pageable pa = new PageRequest(page, SystemConstant.pageSize);
        return dao.findByNameContainingAndTypeContainingAndStatusOrderByNum(name, type, status, pa);
    }

    @Override
    public WxMenu getById(Integer id) {
        return dao.findOne(id);
    }
}
