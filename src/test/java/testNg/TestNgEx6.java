package testNg;

import org.testng.annotations.Test;

public class TestNgEx6 {
	@Test(groups = {"sanity"},enabled = false)
	public void PaymentTest() {
		System.out.println("Payment method");
	}
	
	@Test(groups = {"smoke"})
	public void LoginTest() {
		System.out.println("Login method");
	}
	
	@Test (groups = {"sanity"})
	public void BillingTest() {
		System.out.println("Billing method");
	}
	
	@Test(groups= {"smoke,Regression"})
	public void RegistrationTest() {
		System.out.println("Registration Test");
	}
}
