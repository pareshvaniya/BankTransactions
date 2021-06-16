package com.bank.transactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.bank.transactions.repository")
public class BankTransactionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankTransactionsApplication.class, args);
	}

}
