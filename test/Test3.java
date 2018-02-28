package com.api.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.text.MessageFormat;
import java.util.Properties;

public class Test3 {
	
	private Properties properties_copy;
	private final String propertycopyFilePath= "src//test//resources//Test2.conf";
	
	OutputStream output;

	public Test3()
	{
		
		//BufferedReader readercopy;
		try {
			//readercopy = new BufferedReader(new FileReader(propertycopyFilePath));
			properties_copy = new Properties();
			output = new FileOutputStream("config.properties");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertycopyFilePath);
		}		
	}
	
	public void setBaseProperty(String locatorName, String locatorvalue){
		properties_copy.setProperty(locatorName, locatorvalue);
		try {
			properties_copy.store(output, null);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
