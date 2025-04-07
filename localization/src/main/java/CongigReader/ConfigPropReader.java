package CongigReader;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigPropReader {

	private Properties prop;
	private FileInputStream ip;
	
	public void initLangProp(String language) {
		
		System.out.println("lang is : " + language);
		
		prop = new Properties();
		
		switch (language.toLowerCase()) {
		
		case "english":
			ip = new FileInputStream("./src/main/resources/lang.english.properties");
			break;
			
		default:
			break;
		}
	}
}
