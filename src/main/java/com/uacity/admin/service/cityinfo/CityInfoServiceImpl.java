package com.ws.service.cityinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.db.dao.AccountDao;
import com.ws.db.dao.CityInfoDao;
import com.ws.db.model.Account;
import com.ws.db.model.CityInfo;


@Service("cityinfoService")
public class CityInfoServiceImpl implements CityInfoService{

	@Autowired 
	private CityInfoDao dao;
	
	@Override
	public void save(CityInfo cityinfo) {
		dao.save(cityinfo);
	}

	@Override
	public void delete(Integer id) {
		dao.delete(id);
	}

	@Override
	public List<CityInfo> getAllCityInfo() {
		return dao.findAll();
	}

	@Override
	public CityInfo getCityInfoById(Integer id) {
		return dao.findOne(id);
	}
}
