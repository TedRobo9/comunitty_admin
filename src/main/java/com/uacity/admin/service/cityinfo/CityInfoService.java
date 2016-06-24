package com.uacity.admin.service.cityinfo;

import com.uacity.admin.domain.CityInfo;

import java.util.List;

public interface CityInfoService {

	public void save(CityInfo cityinfo);
	
	public void delete(Integer id);
	
	public List<CityInfo> getAllCityInfo();
	
	public CityInfo getCityInfoById(Integer id);


	

}
