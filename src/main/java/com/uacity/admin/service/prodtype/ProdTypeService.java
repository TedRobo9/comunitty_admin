package com.uacity.admin.service.prodtype;

import com.uacity.admin.domain.ProdType;

import java.util.List;

public interface ProdTypeService {

	public void save(ProdType prodtype);
	public void delete(Integer id);
	public List<ProdType> getAllProdType();
	public ProdType getProdTypeById(Integer id);
}
