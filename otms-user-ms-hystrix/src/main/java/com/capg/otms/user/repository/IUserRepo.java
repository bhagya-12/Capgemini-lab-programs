
	package com.capg.otms.user.repository;



	import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capg.otms.user.model.User;

	public interface IUserRepo extends JpaRepository<User, Long> {

		@Query(value = "from User where userName=:userName")
		public User getUserByName(String userName);

	}

