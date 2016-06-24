package com.uacity.admin.service.integralrecord;

import com.uacity.admin.dao.IntegralrecordDao;
import com.uacity.admin.domain.Integralrecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service("integralrecordService")
public class IntegralrecordServiceImpl implements IntegralrecordService{

	@Autowired 
	private IntegralrecordDao dao;
	
	public void save(Integralrecord integralrecord){
		dao.save(integralrecord);
	}

	@Override
	public Page<Integralrecord> search(String userName,
			String realName, int page) {
//		Pageable pa = new PageRequest(page, SystemConstant.pageSize);
//		return dao.findByCondition(pa);
		return null;
	}

	@Override
	public Integralrecord getById(int id) {
		return dao.findOne(id);
	}

	@Override
	public void delete(Iterable<Integralrecord> integralrecord) {
		dao.deleteInBatch(integralrecord);
		
	}

	@Override
	public void deleteById(Integer id) {
		dao.delete(id);
	}
}
