package com.budgetmgmt.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "expenditure_types")
public class ExpenditureType implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer expTypeId;
	
	@Column(nullable = false)
	private String expTypeName;
	private Integer expTypeMaxValue;
	
	public ExpenditureType() {
	}

	public ExpenditureType(String expTypeName, Integer expTypeMaxValue) {
		this.expTypeName = expTypeName;
		this.expTypeMaxValue = expTypeMaxValue;
	}

	public Integer getExpTypeId() {
		return expTypeId;
	}

	public void setExpTypeId(Integer expTypeId) {
		this.expTypeId = expTypeId;
	}

	public String getExpTypeName() {
		return expTypeName;
	}

	public void setExpTypeName(String expTypeName) {
		this.expTypeName = expTypeName;
	}

	public Integer getExpTypeMaxValue() {
		return expTypeMaxValue;
	}

	public void setExpTypeMaxValue(Integer expTypeMaxValue) {
		this.expTypeMaxValue = expTypeMaxValue;
	}

}
