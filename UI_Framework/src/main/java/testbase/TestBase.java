package testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	Properties prop;
	FileInputStream fis; 
	
	public void intialization() throws IOException {
		
		prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\config.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		
		
	}

}
