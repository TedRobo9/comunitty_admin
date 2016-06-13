package com.ws.service.level;

import java.util.List;

import com.ws.db.model.Level;

public interface LevelService {

	public void save(Level level);
	public void delete(Integer id);
	public List<Level> getAllLevel();
	public Level getLevelById(Integer id);
	public List<Level> search(Level level);
}
