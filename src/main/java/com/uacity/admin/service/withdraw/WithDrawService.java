package com.ws.service.withdraw;

import org.springframework.data.domain.Page;

import com.ws.db.model.WithDraw;

public interface WithDrawService {

	public void save(WithDraw withdraw);
	
	public Page<WithDraw> search(String nickname, int page);
	
	public WithDraw getById(int id);
	
	public void delete(Iterable<WithDraw> withdraw);
	
	public void deleteById(Integer id);

}
