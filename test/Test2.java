package com.api.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Properties;

import org.apache.commons.configuration.ConfigurationException;

public class Test2 {
	
	private Properties properties;
	private final String propertyFilePath= "src//test//resources//Test.conf";
	public static String result, locatorName;
	
	
	public Test2(){
		BufferedReader reader;
		
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
				} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
	
	public void getBaseProperty(String locatorName){
		this.locatorName=locatorName;
		String message = properties.getProperty(locatorName);
		result = MessageFormat.format(message, "Raja");
		System.out.println(result);
	}

	public static void main(String[] args) throws ConfigurationException {
		
		Test2 t = new Test2();
		Test4 t2 = new Test4();
		
		t.getBaseProperty("FIRST_NAME");
		//t2.setBaseProperty(locatorName, result);
		t2.setBaseValues(locatorName, result);

	}

}
