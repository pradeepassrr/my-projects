package com.budgetmgmt.dtos;

public class ExpenditureData {

	private String expTypeName;
	private Double totalAmountSpent;
	private Integer target;

	public ExpenditureData(String expTypeName, Double totalAmountSpent, Integer target) {
		this.expTypeName = expTypeName;
		this.totalAmountSpent = totalAmountSpent;
		this.target = target;
	}

	public String getExpTypeName() {
		return expTypeName;
	}

	public void setExpTypeName(String expTypeName) {
		this.expTypeName = expTypeName;
	}

	public Double getTotalAmountSpent() {
		return totalAmountSpent;
	}

	public void setTotalAmountSpent(Double totalAmountSpent) {
		this.totalAmountSpent = totalAmountSpent;
	}

	public Integer getTarget() {
		return target;
	}

	public void setTarget(Integer target) {
		this.target = target;
	}

}
