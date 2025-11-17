package testNg;

import org.testng.annotations.Test;

public class TimeTestEx {
	@Test(timeOut = 2000)
	public void billingTest() throws InterruptedException {
		System.out.println("billing test");
		Thread.sleep(3000);
	}
}
