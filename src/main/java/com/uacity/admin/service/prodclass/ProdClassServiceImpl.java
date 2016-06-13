package com.ws.service.prodclass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.db.dao.ProdClassDao;
import com.ws.db.model.ProdClass;

@Service("prodclassService")
public class ProdClassServiceImpl implements ProdClassService {

	@Autowired 
	private ProdClassDao dao;
	
	@Override
	public void save(ProdClass prodclass) {
		dao.save(prodclass);
	}

	@Override
	public void delete(Integer id) {
		dao.delete(id);
	}

	@Override
	public List<ProdClass> getAllProdClass() {
		return dao.findAll();
	}

	@Override
	public ProdClass getProdClassById(Integer id) {
		return dao.findOne(id);
	}

}
