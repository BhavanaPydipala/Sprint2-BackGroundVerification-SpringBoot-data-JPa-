package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.entity.EmployeeDocumentDto;
import com.cap.entity.LoginDto;
import com.cap.entity.VerificationDto;
import com.cap.service.BcgService;
import com.cap.service.LoginService;

@RestController
@RequestMapping("/bgv")
@CrossOrigin("http://localhost:4200")

public class BgvController {
	@Autowired
	LoginService loginservice;
	@Autowired
	BcgService bcgservice;
	@GetMapping(value="/login/{enter-userid}/{password}")
	public ResponseEntity<LoginDto> authentication(@PathVariable("enter-userid") int id,@PathVariable("password") String pass)
	{
		LoginDto loginobj=loginservice.authentication(id,pass);
			ResponseEntity<LoginDto> response=new ResponseEntity<LoginDto>(loginobj,HttpStatus.OK);
			return response;
		}

	@GetMapping(value="/getdocumentbyid/{enter-id}")
	public ResponseEntity<EmployeeDocumentDto>getById(@PathVariable("enter-id")  int id)
	{
		EmployeeDocumentDto employeedocumentdtoobj=bcgservice.getById(id);
		ResponseEntity<EmployeeDocumentDto> response=new ResponseEntity<EmployeeDocumentDto>(employeedocumentdtoobj,HttpStatus.OK);
		return response;
	}
	@GetMapping(value="/getdocumentbyname/{enter-name}")
	public ResponseEntity<EmployeeDocumentDto>getById(@PathVariable("enter-name")  String name)
	{
		EmployeeDocumentDto employeedocumentdtoobj=bcgservice.getByName(name);
		ResponseEntity<EmployeeDocumentDto> response=new ResponseEntity<EmployeeDocumentDto>(employeedocumentdtoobj,HttpStatus.OK);
		return response;
	}
	@PostMapping(value="/setstatus")
	public ResponseEntity<String> setStatus(@RequestBody VerificationDto verificationdto)
	{
		VerificationDto vdto=bcgservice.setStatus(verificationdto);
		if(vdto!=null)
		{
			return new ResponseEntity<String>("successfull",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("unsuccessfull",HttpStatus.OK);
		}
	}
	
	
	
	
	
	}

