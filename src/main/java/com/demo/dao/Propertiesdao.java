package com.demo.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.beans.Properties;

public interface Propertiesdao extends JpaRepository<Properties, Integer> {

	List<Properties> findByPropertytypeEquals(String catogory);

	
}
