package temp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import testbase.TestBase;

public class Reader {

	public static void main(String[] args) throws IOException {
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\config.properties");
	prop.load(fis);
	//System.out.println(prop.getProperty("browser"));
	
	//System.out.println(System.getProperty("user.dir"));
	TestBase testbase= new TestBase();
	testbase.intialization();
	}

}
