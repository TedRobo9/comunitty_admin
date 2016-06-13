package com.ws.service.withdraw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ws.constant.SystemConstant;
import com.ws.db.dao.AdminDao;
import com.ws.db.dao.WithDrawDao;
import com.ws.db.model.WithDraw;

@Service("withdrawService")
public class WithDrawServiceImpl implements WithDrawService{

	@Autowired 
	private WithDrawDao dao;
	
	public void save(WithDraw withdraw){
		dao.save(withdraw);
	}

	@Override
	public Page<WithDraw> search(String nickname, int page) {
		Pageable pa = new PageRequest(page, SystemConstant.pageSize);
		return dao.findByWxuseridNickname(nickname,pa);
	}

	@Override
	public WithDraw getById(int id) {
		return dao.findOne(id);
	}

	@Override
	public void delete(Iterable<WithDraw> admins) {
		dao.deleteInBatch(admins);
		
	}

	@Override
	public void deleteById(Integer id) {
		dao.delete(id);
	}
}
