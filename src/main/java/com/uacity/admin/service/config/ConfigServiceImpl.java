package com.uacity.admin.service.config;

import com.uacity.admin.dao.ConfigDao;
import com.uacity.admin.domain.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("configService")
public class ConfigServiceImpl implements ConfigService {

	@Autowired 
	private ConfigDao dao;
	
	@Override
	public void save(Config config) {
		dao.save(config);
	}

	@Override
	public void delete(Integer id) {
		dao.delete(id);
	}

	@Override
	public List<Config> getAllConfig() {
		return dao.findAll();
	}

	@Override
	public Config getConfigById(Integer id) {
		return dao.findOne(id);
	}

}
