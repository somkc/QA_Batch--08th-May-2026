package DependsOnEx;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class DependsOnEx {
	
	@Test(dependsOnMethods="login")
	public void order() {
		System.out.println("calling order function");
	}
	
	@Test
	public void login() {
		assertEquals(true, false);
		System.out.println("calling login function");
	}
	
}
