package com.orghrm.qa.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigProp {
	public static String readProperty(String propKey) {
		FileInputStream fis;
		Properties prop = null;
		//1. get the config.prop file path
		String filePath = System.getProperty("user.dir") + "\\config\\config.properties";
		try {
		//2. to stream the data from File System- harddisk
			fis = new FileInputStream(filePath);
		//3. Creating an object of properties class
			prop = new Properties();
			try {
		//4. to load the data from fileinput stream in the form of bytes		
				prop.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//5. to get the property values
		String propValue = prop.getProperty(propKey);
		return propValue;
	}
	

}
