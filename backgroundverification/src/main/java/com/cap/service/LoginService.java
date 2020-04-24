package com.cap.service;



import com.cap.entity.LoginDto;


public interface LoginService 
{

	public LoginDto authentication(int empId, String password);
	

}
