package com.uacity.admin.service.menu;

import com.uacity.admin.dao.MenuDao;
import com.uacity.admin.domain.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("menuService")
public class MenuServiceImpl implements MenuService {

	@Autowired 
	private MenuDao dao;
	
	@Override
	public void save(Menu menu) {
		dao.save(menu);
	}

	@Override
	public void delete(Integer id) {
		dao.delete(id);
	}

	@Override
	public List<Menu> getTopMenu() {
		List<Menu> datas = dao.findByLevelno(1);
		List<Menu> tmp = new ArrayList<Menu>();
		for(Menu menu : datas){
			tmp.add(menu);
			tmp.addAll(menu.getSubmenu());
		}
		return tmp;
	}

	@Override
	public Menu getMenuById(Integer id) {
		return dao.findOne(id);
	}

}
