package com.budgetmgmt.dtos;

import java.io.Serializable;

public class Expense implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer salary = 142000;
	private Integer addIncome;
	private Integer expTypeId;
	private Integer paymentTypeId;
	private Double amountSpent;

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getAddIncome() {
		return addIncome;
	}

	public void setAddIncome(Integer addIncome) {
		this.addIncome = addIncome;
	}

	public Integer getExpTypeId() {
		return expTypeId;
	}

	public void setExpTypeId(Integer expTypeId) {
		this.expTypeId = expTypeId;
	}

	public Integer getPaymentTypeId() {
		return paymentTypeId;
	}

	public void setPaymentTypeId(Integer paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}

	public Double getAmountSpent() {
		return amountSpent;
	}

	public void setAmountSpent(Double amountSpent) {
		this.amountSpent = amountSpent;
	}

	@Override
	public String toString() {
		return "Expense [salary=" + salary + ", addIncome=" + addIncome + ", expTypeId=" + expTypeId
				+ ", paymentTypeId=" + paymentTypeId + ", amountSpent=" + amountSpent + "]";
	}

}
