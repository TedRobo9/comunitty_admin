package com.uacity.admin.service.level;

import com.uacity.admin.domain.Level;

import java.util.List;

public interface LevelService {

	public void save(Level level);
	public void delete(Integer id);
	public List<Level> getAllLevel();
	public Level getLevelById(Integer id);
	public List<Level> search(Level level);
}
