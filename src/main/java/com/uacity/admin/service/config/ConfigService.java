package com.ws.service.config;

import java.util.List;

import com.ws.db.model.Config;
import com.ws.db.model.Menu;

public interface ConfigService {

	public void save(Config config);
	public void delete(Integer id);
	public List<Config> getAllConfig();
	public Config getConfigById(Integer id);
}
