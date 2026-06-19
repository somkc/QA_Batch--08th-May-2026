package sauceTests;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		LoginTest log = new LoginTest();
		log.login();
		AddToCart crt= new AddToCart();
		crt.cart();
		LogoutTest lo= new LogoutTest();
		lo.logout();

	}

}
