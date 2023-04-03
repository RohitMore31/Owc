package com.demo.service;

import java.util.List;

import com.demo.beans.Properties;

public interface PropertiesServices {

	boolean addnewproperty(Properties p);

	List<Properties> showallproperties(String catogory);

	boolean deletebyid(int id);

}
