package com.uacity.admin.service.admin;

import com.uacity.admin.domain.AdminInfo;
import org.springframework.data.domain.Page;

public interface AdminService {

	public void save(AdminInfo admin);
	
	public Page<AdminInfo> search(String userName, String realName, int page);
	
	public AdminInfo getById(int id);
	
	public void delete(Iterable<AdminInfo> admins);
	
	public void deleteById(Integer id);
	
	public AdminInfo getAdmin(String username, String password);
	
	public AdminInfo getByName(String username);

}
