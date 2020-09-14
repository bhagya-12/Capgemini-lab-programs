package com.capg.otms.user.service;


	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import com.capg.otms.user.model.User;
	import com.capg.otms.user.repository.IUserRepo;

	@Service
	public class UserServiceImpl implements IUserService {
	@Autowired
		IUserRepo repo;
	///@Autowired
		//RestTemplate rt;
	
		

		@Override
		public List<User> getAllUsers() {
			// TODO Auto-generated method stub
			return repo.findAll();
		}
		
		
		
		}