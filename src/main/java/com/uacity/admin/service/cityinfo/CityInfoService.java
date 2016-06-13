package com.ws.service.cityinfo;

import java.util.List;

import org.springframework.data.domain.Page;

import com.ws.db.model.Account;
import com.ws.db.model.AdminInfo;
import com.ws.db.model.CityInfo;
import com.ws.db.model.Menu;

public interface CityInfoService {

	public void save(CityInfo cityinfo);
	
	public void delete(Integer id);
	
	public List<CityInfo> getAllCityInfo();
	
	public CityInfo getCityInfoById(Integer id);


	

}
