package com.budgetmgmt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.budgetmgmt.entities.ExpenditureType;
import com.budgetmgmt.repositories.ExpTypesRepo;

@Service
public class AdminService {

	@Autowired
	private ExpTypesRepo expTypeRepo;
	
	public void addExpenditureType(String expTypeName, Integer expTypeMaxValue) {
		ExpenditureType et = new ExpenditureType(expTypeName, expTypeMaxValue);
		expTypeRepo.saveAndFlush(et);
	}
	
	public List<ExpenditureType> getAllExpenditures() {
		return expTypeRepo.findAll();
	}
}
