package com.ws.service.menu;

import java.util.List;

import com.ws.db.model.Menu;

public interface MenuService {

	public void save(Menu menu);
	public void delete(Integer id);
	public List<Menu> getTopMenu();
	public Menu getMenuById(Integer id);
}
