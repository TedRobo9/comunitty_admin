package com.ws.service.integralrecord;

import org.springframework.data.domain.Page;

import com.ws.db.model.Integralrecord;

public interface IntegralrecordService {

	public void save(Integralrecord integralrecord);
	
	public Page<Integralrecord> search(String userName, String realName, int page);
	
	public Integralrecord getById(int id);
	
	public void delete(Iterable<Integralrecord> admins);
	
	public void deleteById(Integer id);

}
