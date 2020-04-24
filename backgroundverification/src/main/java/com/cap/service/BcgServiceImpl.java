package com.cap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.BcgDaoRepository;
import com.cap.dao.BcgStatusRepository;
import com.cap.entity.EmployeeDocumentDto;
import com.cap.entity.VerificationDto;

@Service
public class BcgServiceImpl implements  BcgService {
	@Autowired
	BcgDaoRepository  bcgdao;
	@Autowired
	BcgStatusRepository bcgstatusdao;
	@Override
	public EmployeeDocumentDto getById(int id) {
		// TODO Auto-generated method stub
		return bcgdao.getById(id);
	}

	@Override
	public EmployeeDocumentDto getByName(String name) {
		// TODO Auto-generated method stub
		return bcgdao.getByName(name);
	}

	@Override
	public VerificationDto setStatus(VerificationDto verificationdto) {
		// TODO Auto-generated method stub
		return bcgstatusdao.save(verificationdto);
		
	}

}
