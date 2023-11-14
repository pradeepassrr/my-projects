package com.budgetmgmt.services;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.budgetmgmt.dtos.ExpenditureData;
import com.budgetmgmt.dtos.Expense;
import com.budgetmgmt.entities.ExpenditureType;
import com.budgetmgmt.entities.Expenditures;
import com.budgetmgmt.entities.PaymentType;
import com.budgetmgmt.repositories.ExpTypesRepo;
import com.budgetmgmt.repositories.ExpendituresRepo;
import com.budgetmgmt.repositories.PaymentTypesRepo;

@Service
public class HomeService {

	@Autowired
	private PaymentTypesRepo paymentTypeRepo;

	@Autowired
	private ExpTypesRepo expTypeRepo;

	@Autowired
	private ExpendituresRepo expRepo;

	public Map<Integer, String> getAllExpenditureTypes() {

		Map<Integer, String> expTypesMap = new LinkedHashMap<>();

		List<ExpenditureType> expTypes = expTypeRepo.findAll();

		for (ExpenditureType et : expTypes) {
			expTypesMap.put(et.getExpTypeId(), et.getExpTypeName());
		}

		return expTypesMap;
	}

	public Map<Integer, String> getAllPaymentTypes() {

		Map<Integer, String> paymentTypesMap = new LinkedHashMap<>();

		List<PaymentType> paymentTypes = paymentTypeRepo.findAll();

		for (PaymentType pt : paymentTypes) {
			paymentTypesMap.put(pt.getPaymentTypeId(), pt.getPaymentTypeName());
		}

		return paymentTypesMap;
	}

	public List<ExpenditureData> getAllExpenditures() {
		return expRepo.findAllExpenditures();
	}
	
	public void addExpense(Expense expense) {
		
		ExpenditureType expType = expTypeRepo.getReferenceById(expense.getExpTypeId());
		PaymentType paymentType = paymentTypeRepo.getReferenceById(expense.getPaymentTypeId());
		
		Expenditures expdEntity = new Expenditures(expense.getAmountSpent(), expType, paymentType);
		expRepo.saveAndFlush(expdEntity);
	}
}
