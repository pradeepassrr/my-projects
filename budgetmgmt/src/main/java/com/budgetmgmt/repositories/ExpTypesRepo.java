package com.budgetmgmt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.budgetmgmt.entities.ExpenditureType;

@Repository
public interface ExpTypesRepo extends JpaRepository<ExpenditureType, Integer> {

}
