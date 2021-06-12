package com.example.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loan.model.Applicant;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, String> {

}



