package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.entity.VerificationDto;

public interface BcgStatusRepository extends JpaRepository<VerificationDto,Integer> {

}
