package com.cap.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cap.entity.LoginDto;

@Repository
public interface LoginDaoRepository  extends JpaRepository<LoginDto,Integer>
{
	@Query("select login from LoginDto login  where empId=?1 and password=?2 ")
	public LoginDto authentication(int empId, String password);
	
}
