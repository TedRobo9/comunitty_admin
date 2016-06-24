package com.uacity.admin.service.withdraw;

import com.uacity.admin.domain.WithDraw;
import org.springframework.data.domain.Page;

public interface WithDrawService {

	public void save(WithDraw withdraw);
	
	public Page<WithDraw> search(String nickname, int page);
	
	public WithDraw getById(int id);
	
	public void delete(Iterable<WithDraw> withdraw);
	
	public void deleteById(Integer id);

}
