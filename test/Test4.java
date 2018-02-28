package com.api.test;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class Test4 {

	private final String propertycopyFilePath= "src//test//resources//Test2.conf";
	
	public void setBaseValues(String locatorName, String locatorvalue) throws ConfigurationException
	{
		PropertiesConfiguration conf = new PropertiesConfiguration(propertycopyFilePath);
		conf.setProperty(locatorName, locatorvalue);
		conf.save();
	}
	
}
