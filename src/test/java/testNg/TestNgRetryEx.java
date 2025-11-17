package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgRetryEx {
	@Test
	public void login() {
		System.out.println("Login test");
		Assert.assertTrue(false);
	}
}
