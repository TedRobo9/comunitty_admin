package com.ws.service.prodclass;

import java.util.List;

import com.ws.db.model.ProdClass;

public interface ProdClassService {

	public void save(ProdClass prodclass);
	public void delete(Integer id);
	public List<ProdClass> getAllProdClass();
	public ProdClass getProdClassById(Integer id);
}
