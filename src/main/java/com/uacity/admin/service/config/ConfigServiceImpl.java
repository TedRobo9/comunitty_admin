package com.ws.service.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.db.dao.ConfigDao;
import com.ws.db.dao.MenuDao;
import com.ws.db.model.Config;
import com.ws.db.model.Menu;

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
