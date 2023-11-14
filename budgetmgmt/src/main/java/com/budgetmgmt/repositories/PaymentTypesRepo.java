package com.budgetmgmt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.budgetmgmt.entities.PaymentType;

@Repository
public interface PaymentTypesRepo extends JpaRepository<PaymentType, Integer> {

}
