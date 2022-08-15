package com.wipro.velocity.service;

import com.wipro.velocity.model.Dealer;
import com.wipro.velocity.repository.DealerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoginService {

	@Autowired  //DI -> to insert at run time.
	private DealerRepository drepo;	//creating instance of DealerRepository
	public void saveDealer(Dealer dealer)
	{
		drepo.save(dealer);   //invokes save() method of JPA Repository
	}
	public Dealer findByEmail(String email)
	{
		return drepo.findByEmail(email);
	}
}
