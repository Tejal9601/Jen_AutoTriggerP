package testClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pom.AdminLoginsWithPara3;

public class AdminLoginWithPara3  extends BaseClass{
	AdminLoginsWithPara3 login;

	@BeforeMethod 
	public void beforeMethod() throws InterruptedException {
		launchApp();
	}
	@Parameters({"username" ,"password"})
	@Test 
	public void admLogin(String user, String pass) {
		login = new AdminLoginsWithPara3 ();
		login.adminLogins(user, pass);

	}
	
}
