package com.tutorialsninja.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	public static Properties prop;
	public static FileInputStream ip;
	public static FileInputStream ip1;

	public static Properties initializePropertiesFile() throws Exception {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config\\Config.properties");
		prop.load(ip);
		
		ip1 = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config\\Extent.properties");
		//prop.load(ip1);
		return prop;
	}

}
