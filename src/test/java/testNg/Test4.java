package testNg;

import org.testng.annotations.Test;

public class Test4 {
	@Test

	public void Payment() {
		System.out.println("Payment");
	}
	@Test
	(priority = 2)
	public void Billing() {
		System.out.println("Billing");
	}
	@Test

	public void Login() {
		System.out.println("Login");
	}
	@Test(priority = 0)
	public void Registration() {
		System.out.println("Registration");
	}
}
