package com.ws.service.prod;

import org.springframework.data.domain.Page;

import com.ws.db.model.Prod;

public interface ProdService {

	public void save(Prod prod);
	
	public Page<Prod> search(String name,
			int classid, int typeid,int stock,String gdstatus, int page);
	
	public Prod getById(int id);
	
	public void delete(Iterable<Prod> prod);
	
	public void deleteById(Integer id);

}
