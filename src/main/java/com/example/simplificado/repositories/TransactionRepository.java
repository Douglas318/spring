package com.example.simplificado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.simplificado.domain.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}
