package com.budgetmgmt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.budgetmgmt.dtos.Expense;
import com.budgetmgmt.services.HomeService;

@Controller
public class HomeController {

	@Autowired
	private HomeService service;

	@GetMapping("/")
	public String index(Model model) {
		return addModelAttributes(model);
	}
	
	@PostMapping("/addExpense")
	public String addExpense(Expense expense, Model model) {
		service.addExpense(expense);
		return addModelAttributes(model);
	}
	
	private String addModelAttributes(Model model) {
		model.addAttribute("expenditureTypes", service.getAllExpenditureTypes());
		model.addAttribute("paymentTypes", service.getAllPaymentTypes());
		model.addAttribute("expenditures", service.getAllExpenditures());
		
		return "index";
	}

}
