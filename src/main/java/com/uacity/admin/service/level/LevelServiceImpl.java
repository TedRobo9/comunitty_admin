package com.ws.service.level;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.db.dao.LevelDao;
import com.ws.db.model.Level;

@Service("levelService")
public class LevelServiceImpl implements LevelService {

	@Autowired 
	private LevelDao dao;
	
	@Override
	public void save(Level Level) {
		dao.save(Level);
	}

	@Override
	public void delete(Integer id) {
		dao.delete(id);
	}

	@Override
	public List<Level> getAllLevel() {
		return dao.findAll();
	}

	@Override
	public Level getLevelById(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public List<Level> search(Level Level) {
		// TODO Auto-generated method stub
		return dao.findByCondition(1);
	}

}
