package DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEg {
	
	
	@DataProvider(name="TestData")
	public String[][] data() {
		
		String[][] login= new String[3][2];
		login[0][0]="user1";
		login[0][1]="pwd1";
		
		login[1][0]="user2";
		login[1][1]="pwd2";
		
		login[2][0]="user3";
		login[2][1]="pwd3";
		
	
		
		return login;
		
	}
	
	@DataProvider(name="TestData2")
	public String[][] data2() {
		//column value is equal to number of parameters
		//row value is equal number of data sets
		String[][] login= new String[2][3];
		login[0][0]="user1";
		login[0][1]="pwd1";
		login[0][2]="email1";
		
		login[1][0]="user2";
		login[1][1]="pwd2";
		login[1][2]="email2";
		
	
		
	
		
		return login;
		
	}
	
	
	
	
	//@Test(dataProvider="TestData")
	public void method(String username, String password) {
		System.out.println(username+" | "+password);
	}
	
	@Test(dataProvider="TestData2")
	public void method(String username, String password,String email) {
		System.out.println(username+" | "+password+" | "+ email);
	}
	
	
	
	
		
	
	
}

	
	
	
	

	


