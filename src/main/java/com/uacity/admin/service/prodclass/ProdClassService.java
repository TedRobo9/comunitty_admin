package com.uacity.admin.service.prodclass;

import com.uacity.admin.domain.ProdClass;

import java.util.List;

public interface ProdClassService {

	public void save(ProdClass prodclass);
	public void delete(Integer id);
	public List<ProdClass> getAllProdClass();
	public ProdClass getProdClassById(Integer id);
}
