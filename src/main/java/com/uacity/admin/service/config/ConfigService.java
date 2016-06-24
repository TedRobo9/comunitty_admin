package com.uacity.admin.service.config;

import com.uacity.admin.domain.Config;

import java.util.List;

public interface ConfigService {

	public void save(Config config);
	public void delete(Integer id);
	public List<Config> getAllConfig();
	public Config getConfigById(Integer id);
}
