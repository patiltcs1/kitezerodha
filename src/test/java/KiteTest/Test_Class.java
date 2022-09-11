package KiteTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base_class;
import POM_classes.POM1;
import POM_classes.POM2;
import POM_classes.POM3;
import Utility.Utility_class;

public class Test_Class extends Base_class {
	
	//declare all useful member as global
        POM1 login1;
        POM2 login2;
        POM3 home;
	
	@BeforeClass
	public void openBrowser() throws Throwable  {
		intitilizeBrowser();
		
	//all objects of POM class
		login1=new POM1(driver);
		login2=new POM2(driver);
		home=new POM3(driver);
		
	}
	@BeforeMethod
	public void loginToApp()throws Throwable {
		//enter UN
		login1.enterUN(Utility_class.getTD(0, 0));
		System.out.println(Utility_class.getTD(0, 0));
		
		//enter PWD
		login1.enterPWD(Utility_class.getTD(0, 1));
		
		//click on login
	    login1.clickLOGINBTN();
	    
	    //enter pin
	    login2.enterPIN(Utility_class.getTD(0, 2));
	    
	    //click on continue button
	    login2.clickCTNBTN();
	}
	@Test
	public void verifyuserID()throws Throwable {
		Reporter.log("running verify user id",true);
		 String actID = home.verifyuserID();
		 String expID=Utility_class.getTD(0, 0);
		 Assert.assertEquals(expID, actID,"both are different tc is fail");
		
	}
	
	@AfterMethod
	public void logoutApp() {
		Reporter.log("logout the application",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close the app",true);
	}
	 

	}

