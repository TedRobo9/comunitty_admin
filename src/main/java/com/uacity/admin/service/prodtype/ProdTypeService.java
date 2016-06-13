package com.ws.service.prodtype;

import java.util.List;

import com.ws.db.model.ProdType;

public interface ProdTypeService {

	public void save(ProdType prodtype);
	public void delete(Integer id);
	public List<ProdType> getAllProdType();
	public ProdType getProdTypeById(Integer id);
}
