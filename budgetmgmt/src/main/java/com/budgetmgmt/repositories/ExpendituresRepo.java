package com.budgetmgmt.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.budgetmgmt.dtos.ExpenditureData;
import com.budgetmgmt.entities.Expenditures;

@Repository
public interface ExpendituresRepo extends JpaRepository<Expenditures, Integer> {

	@Query("SELECT new com.budgetmgmt.dtos.ExpenditureData(et.expTypeName, SUM(e.amountSpent), et.expTypeMaxValue) "
			+ "FROM Expenditures e inner join e.expenditureType et GROUP BY et.expTypeName, et.expTypeMaxValue")
	List<ExpenditureData> findAllExpenditures();

}
