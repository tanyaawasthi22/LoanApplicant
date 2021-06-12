package com.example.loan.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table
public class Applicant {
	
	@Id
	private String SSN;
	private int Loan_Amount;
	private int Current_Annual_INCOME;
	private LocalDate Last_Loan_Taken;
	
	
	public Applicant(){
		
	}
	public Applicant(String sSN, int loan_Amount, int current_Annual_INCOME, LocalDate last_Loan_Taken) {
		super();
		SSN = sSN;
		Loan_Amount = loan_Amount;
		Current_Annual_INCOME = current_Annual_INCOME;
		Last_Loan_Taken = last_Loan_Taken;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public int getLoan_Amount() {
		return Loan_Amount;
	}
	public void setLoan_Amount(int loan_Amount) {
		Loan_Amount = loan_Amount;
	}
	public int getCurrent_Annual_INCOME() {
		return Current_Annual_INCOME;
	}
	public void setCurrent_Annual_INCOME(int current_Annual_INCOME) {
		Current_Annual_INCOME = current_Annual_INCOME;
	}
	public LocalDate getLast_Loan_Taken() {
		return Last_Loan_Taken;
	}
	public void setLast_Loan_Taken(LocalDate last_Loan_Taken) {
		Last_Loan_Taken = last_Loan_Taken;
	}
	
	

}
