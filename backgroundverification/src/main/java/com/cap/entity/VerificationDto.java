package com.cap.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="verification")

public class VerificationDto
{
	@Id
int empid;
 String status;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
}
