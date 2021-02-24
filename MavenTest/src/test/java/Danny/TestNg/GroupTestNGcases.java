package Danny.TestNg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
   @Test (groups ="user-registration")
public class GroupTestNGcases {
    @Test(priority=1,groups="Regression")
    public void aTest1() {
    	System.out.println("test1");
    }
    @Test(priority=2,groups ="Regression")
    public void aTest2() {
    	System.out.println("test2");
    }
    @Test(groups={"Regression","bvt"})
    public void aTest3() {
    	System.out.println("test3");
    }
    @Test(groups="bvt")
    public void aTest4() {
    	System.out.println("test4");
    }
    
	}
   


