package com.uacity.admin.service.integralrecord;

import com.uacity.admin.domain.Integralrecord;
import org.springframework.data.domain.Page;

public interface IntegralrecordService {

	public void save(Integralrecord integralrecord);
	
	public Page<Integralrecord> search(String userName, String realName, int page);
	
	public Integralrecord getById(int id);
	
	public void delete(Iterable<Integralrecord> admins);
	
	public void deleteById(Integer id);

}
