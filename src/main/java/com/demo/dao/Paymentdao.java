package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.beans.Payment;

public interface Paymentdao extends JpaRepository<Payment, Integer> {

}
