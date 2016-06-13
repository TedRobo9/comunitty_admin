package com.ws.service.markettype;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.db.dao.MarketTypeDao;
import com.ws.db.model.MarketType;

@Service("marketTypeService")
public class MarketTypeServiceImpl implements MarketTypeService {

	@Autowired 
	private MarketTypeDao dao;
	
	@Override
	public void save(MarketType MarketType) {
		dao.save(MarketType);
	}

	@Override
	public void delete(Integer id) {
		dao.delete(id);
	}

	@Override
	public List<MarketType> getAllMarketType() {
		return dao.findAll();
	}

	@Override
	public MarketType getMarketTypeById(Integer id) {
		return dao.findOne(id);
	}

}
