package com.uacity.admin.service.prod;

import com.uacity.admin.domain.Prod;
import org.springframework.data.domain.Page;

public interface ProdService {

	public void save(Prod prod);
	
	public Page<Prod> search(String name,
			int classid, int typeid,int stock,String gdstatus, int page);
	
	public Prod getById(int id);
	
	public void delete(Iterable<Prod> prod);
	
	public void deleteById(Integer id);

}
