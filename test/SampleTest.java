package com.api.test;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.SystemConfiguration;

public class SampleTest {

	public void readPropertyFile()
	{
		
		PropertiesConfiguration propertiesConfiguration = new PropertiesConfiguration();
		SystemConfiguration systemConfiguration = new SystemConfiguration();
		String globalConfigFile = systemConfiguration.getString("./src/test/resources");
		if (globalConfigFile != null)
		{
			try {
				propertiesConfiguration.setDelimiterParsingDisabled(true);
				propertiesConfiguration.load(globalConfigFile);
			} 
			catch (ConfigurationException e) 
			{
				System.out.println(e);

			}
		}
	}
	
	
	public static void main(String[] args) {
		

		}

	

}
