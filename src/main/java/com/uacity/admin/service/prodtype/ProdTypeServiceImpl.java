package com.ws.service.prodtype;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.db.dao.ProdTypeDao;
import com.ws.db.model.ProdType;

@Service("prodtypeService")
public class ProdTypeServiceImpl implements ProdTypeService {

	@Autowired 
	private ProdTypeDao dao;
	
	@Override
	public void save(ProdType prodtype) {
		dao.save(prodtype);
	}

	@Override
	public void delete(Integer id) {
		dao.delete(id);
	}

	@Override
	public List<ProdType> getAllProdType() {
		return dao.findAll();
	}

	@Override
	public ProdType getProdTypeById(Integer id) {
		return dao.findOne(id);
	}

}
