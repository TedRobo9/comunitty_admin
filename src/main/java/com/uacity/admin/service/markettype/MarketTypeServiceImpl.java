package com.uacity.admin.service.markettype;

import com.uacity.admin.dao.MarketTypeDao;
import com.uacity.admin.domain.MarketType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
