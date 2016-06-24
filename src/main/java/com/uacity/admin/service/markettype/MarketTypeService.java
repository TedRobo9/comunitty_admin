package com.uacity.admin.service.markettype;

import com.uacity.admin.domain.MarketType;

import java.util.List;

public interface MarketTypeService {

	public void save(MarketType markettype);
	public void delete(Integer id);
	public List<MarketType> getAllMarketType();
	public MarketType getMarketTypeById(Integer id);
}
