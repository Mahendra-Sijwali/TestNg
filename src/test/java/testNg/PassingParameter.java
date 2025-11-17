package testNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class PassingParameter {
	@Test
	@Parameters({"UserName","Password"})
	public void login(String username,String password) {
		System.out.println("Username : "+username+"  Password : "+password);
	}
}
