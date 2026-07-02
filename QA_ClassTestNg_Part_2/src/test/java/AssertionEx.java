import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AssertionEx {
	
	@Test
	public void compare() {
		String name="dean";
  //  assertEquals(name, "peter");
    assertEquals(10,20,"numbers dont match");
	}

}
