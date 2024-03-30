package com.training.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonUtilities {
	
	public String getProperty(String key) throws IOException {
		String userDir = System.getProperty("user.dir");
		String fileSeparator = System.getProperty("file.separator");
		
		String spath= userDir + fileSeparator + "Properties\\application.properties";
		
		FileInputStream fileInput = new FileInputStream(spath);
		
		Properties prop = new Properties();
		prop.load(fileInput);
		
		String value = prop.getProperty(key);
		return value;
	}

}
