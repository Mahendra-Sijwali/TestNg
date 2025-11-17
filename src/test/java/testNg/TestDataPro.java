package testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataPro {
	
		@Test(dataProvider = "RetriveData")
		public void login(String userName, String password) {
			System.out.println("UserName: "+userName+"Password: "+password);
		}
		
		@DataProvider(name= "RetriveData")
		public Object[][] getData(){
			Object[][]  obj= new Object[3][2];
			obj[0][0] = "Mahendra";
			obj[0][1] = "m123";
			obj[1][0] = "Aryan";
			obj[1][1] = "A123";
			obj[2][0] = "Abhishek";
			obj[2][1] = "A123";
			return obj;
			
		}
}
