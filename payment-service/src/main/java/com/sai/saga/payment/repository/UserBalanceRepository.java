package com.sai.saga.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sai.saga.payment.entity.UserBalance;

public interface UserBalanceRepository extends JpaRepository<UserBalance, Integer>{

}
