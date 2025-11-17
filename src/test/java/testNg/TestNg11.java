package testNg;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(TestNgListnerEx1.class)
public class TestNg11 {
	
	@Test(dependsOnMethods = "RegistrationTest")
	public void PaymentTest() {
		System.out.println("PaymentMethod");
	
	}

	@Test
	public void LoginTest() {
		System.out.println("LoginMethod");
	}
	
	@Test
	public void BilingTest() {
		System.out.println("BilingMethod");
		
	}
	
	@Test
	public void RegistrationTest() {
		System.out.println("RegistrationMethod");
		Assert.assertTrue(false);
	}
}
