package com.budgetmgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${env}.properties")
public class BudgetmgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(BudgetmgmtApplication.class, args);
	}

}