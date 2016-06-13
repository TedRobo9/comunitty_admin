package com.ws.service.prod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ws.constant.SystemConstant;
import com.ws.db.dao.AdminDao;
import com.ws.db.dao.ProdDao;
import com.ws.db.model.Prod;

@Service("ProdService")
public class ProdServiceImpl implements ProdService{

	@Autowired 
	private ProdDao dao;
	
	public void save(Prod admin){
		dao.save(admin);
	}

	@Override
	public Page<Prod> search(String name,
			int classid, int typeid,int stock,String gdstatus, int page) {
		Pageable pa = new PageRequest(page, SystemConstant.pageSize);
		return dao.findByNameAndClassidAndTypeidAndStockAndGdstatus(name, classid, typeid,stock,gdstatus,pa);
	}

	@Override
	public Prod getById(int id) {
		return dao.findOne(id);
	}

	@Override
	public void delete(Iterable<Prod> admins) {
		dao.deleteInBatch(admins);
		
	}

	@Override
	public void deleteById(Integer id) {
		dao.delete(id);
	}
}
