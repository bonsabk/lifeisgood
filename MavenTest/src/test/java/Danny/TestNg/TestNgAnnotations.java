package Danny.TestNg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	public class loginTest{
		@BeforeTest(groups ="Regression")
		public void loginToApplication() {
			System.out.println("login to Application");
			
		}
		@AfterTest(groups ="user-registration")
		public void logoutfromApplication()
		{
			System.out.println("logout from Application");
			
		}
	@Test (priority=1,description="This is a login test")
	public void aloginTest() {
		System.out.println("loing is successful");
		
	}
	@Test (priority=2, description="This is a logout test")
	public void alogoutTest() {
		System.out.println("logout is successsful");
	}
	}

}
