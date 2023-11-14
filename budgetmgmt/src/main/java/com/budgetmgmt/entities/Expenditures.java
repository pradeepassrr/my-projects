package com.budgetmgmt.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Calendar;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "expenditures")
public class Expenditures implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer expId;

	private Double amountSpent;

	@ManyToOne
	@JoinColumn(name = "exp_type_id", referencedColumnName = "expTypeId")
	private ExpenditureType expenditureType;

	@ManyToOne
	@JoinColumn(name = "payment_type_id", referencedColumnName = "paymentTypeId")
	private PaymentType paymentType;

	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp createdDate = new Timestamp(Calendar.getInstance().getTimeInMillis());

	public Expenditures() {
	}

	public Expenditures(Double amountSpent, ExpenditureType expenditureType, PaymentType paymentType) {
		super();
		this.amountSpent = amountSpent;
		this.expenditureType = expenditureType;
		this.paymentType = paymentType;
	}

	public Integer getExpId() {
		return expId;
	}

	public void setExpId(Integer expId) {
		this.expId = expId;
	}

	public Double getAmountSpent() {
		return amountSpent;
	}

	public void setAmountSpent(Double amountSpent) {
		this.amountSpent = amountSpent;
	}

	public ExpenditureType getExpenditureType() {
		return expenditureType;
	}

	public void setExpenditureType(ExpenditureType expenditureType) {
		this.expenditureType = expenditureType;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

}
