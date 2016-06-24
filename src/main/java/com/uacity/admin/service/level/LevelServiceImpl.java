package com.uacity.admin.service.level;

import com.uacity.admin.dao.LevelDao;
import com.uacity.admin.domain.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
