package testNg;

import org.testng.annotations.Test;

public class Test5 {
	@Test(dependsOnMethods= {"login"},invocationCount = 5)
	public void payment(){
		System.out.println("payment");
	}
	
	@Test
	public void login(){
		System.out.println("login");
	}
}
