package com.ws.service.admin;

import org.springframework.data.domain.Page;

import com.ws.db.model.AdminInfo;

public interface AdminService {

	public void save(AdminInfo admin);
	
	public Page<AdminInfo> search(String userName, String realName, int page);
	
	public AdminInfo getById(int id);
	
	public void delete(Iterable<AdminInfo> admins);
	
	public void deleteById(Integer id);
	
	public AdminInfo getAdmin(String username, String password);
	
	public AdminInfo getByName(String username);

}
