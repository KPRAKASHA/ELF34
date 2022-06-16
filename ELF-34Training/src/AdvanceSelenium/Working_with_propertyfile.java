package AdvanceSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Working_with_propertyfile {
	@Test
	public static String test(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./testdata/config.properties");
		Properties property=new Properties();
		property.load(fis);
		
		return property.getProperty(key);
	
	}

}