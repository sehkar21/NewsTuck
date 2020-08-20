 package com.qa.config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties prop;
	
	public ReadConfig() {
		String filepath = System.getProperty("user.dir");
		File src = new File(filepath+"/config/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
			}
		catch(Exception e) {
			System.out.println("Exception is: " + e.getMessage());
		}
	}
	
	
	public String browsername() {
		String Browser = prop.getProperty("browser");
		return Browser;
	}
	
	public String url() {
		String url = prop.getProperty("url");
		return url;
	}
	
	public String username() {
		String username = prop.getProperty("username");
		return username;
	}
	public String password() {
		String password = prop.getProperty("password");
		return password;
	}
	
	public String Editorusername() {
		String Editorusername = prop.getProperty("Editorusername");
		return Editorusername;
	}
	public String Editorpassword() {
		String Editorpassword = prop.getProperty("Editorpassword");
		return Editorpassword;
	}
	
	
}
