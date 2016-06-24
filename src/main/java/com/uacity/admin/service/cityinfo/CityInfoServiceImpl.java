package com.uacity.admin.service.cityinfo;

import com.uacity.admin.dao.CityInfoDao;
import com.uacity.admin.domain.CityInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("cityinfoService")
public class CityInfoServiceImpl implements CityInfoService {

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
