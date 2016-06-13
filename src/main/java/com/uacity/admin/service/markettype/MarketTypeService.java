package com.ws.service.markettype;

import java.util.List;

import com.ws.db.model.MarketType;

public interface MarketTypeService {

	public void save(MarketType markettype);
	public void delete(Integer id);
	public List<MarketType> getAllMarketType();
	public MarketType getMarketTypeById(Integer id);
}
