import org.testng.annotations.Test;

public class PriorityEx {
	
	@Test(priority=1)
	public void login() {
		System.out.println("calling login");
	}
	@Test(priority=2)
	public void order() {
		System.out.println("calling order");
	}
	@Test(priority=1)
	public void logout() {
		System.out.println("calling logout");
	}
	@Test(priority=-3)
	public void filter() {
		System.out.println("calling filter");
	}

}
