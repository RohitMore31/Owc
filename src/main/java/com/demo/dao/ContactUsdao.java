package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.beans.ContactUs;

public interface ContactUsdao extends JpaRepository<ContactUs, Integer> {

}
