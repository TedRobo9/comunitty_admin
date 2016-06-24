package com.uacity.admin.service.menu;

import com.uacity.admin.domain.Menu;

import java.util.List;

public interface MenuService {

	public void save(Menu menu);
	public void delete(Integer id);
	public List<Menu> getTopMenu();
	public Menu getMenuById(Integer id);
}
