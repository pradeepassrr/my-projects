package com.budgetmgmt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.budgetmgmt.services.AdminService;

@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@GetMapping("/admin")
	public String showHome(Model model) {
		return addModelAttributes(model);
	}

	@PostMapping("/addExpenditureType")
	public String addExpenditureType(@RequestParam String expTypeName, @RequestParam Integer expTypeMaxValue,
			Model model) {
		adminService.addExpenditureType(expTypeName, expTypeMaxValue);
		return addModelAttributes(model);
	}
	
	private String addModelAttributes(Model model) {
		model.addAttribute("expenditureTypes", adminService.getAllExpenditures());

		return "admin";
	}
}
