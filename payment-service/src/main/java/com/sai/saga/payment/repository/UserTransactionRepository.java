package com.sai.saga.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sai.saga.payment.entity.UserTransaction;

public interface UserTransactionRepository extends JpaRepository<UserTransaction, Integer>{

}
