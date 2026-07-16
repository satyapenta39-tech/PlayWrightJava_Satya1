package TestPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

import basetest.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void LoginTest1() {
		//creating objects for pages
		LoginPage loginpage = new LoginPage(page);
		HomePage homepage = new HomePage(page);
		test.info("Navigating to login page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		
		test.info("adding username");

		loginpage.addusername("Admin");
		test.info("adding password");
		loginpage.addPassword("admin123");
		test.info("clicking logion Button");
		loginpage.clickLoginButton();
		// loginpage.login("Admin", "admin123");
		test.info("checking home page");
		homepage.clickTimelink();
		test.info("all tests completed");


	}
	@Test(enabled = false)  //testng level so in next test added inside
	public void LoginTest2() {
		//creating objects for pages
		LoginPage loginpage = new LoginPage(page);
		HomePage homepage = new HomePage(page);
		test.info("Navigating to login page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		
		test.info("adding username");

		loginpage.addusername("Admin");
		test.info("adding password");
		loginpage.addPassword("admin123");
		test.info("clicking logion Button");
		loginpage.clickLoginButton();
		// loginpage.login("Admin", "admin123");
		test.info("checking home page");
		homepage.clickTimelink();
		test.info("all tests completed");


	}
	@Test
	public void LoginTest3() {
		
		
		//creating objects for pages
		LoginPage loginpage = new LoginPage(page);
		HomePage homepage = new HomePage(page);
		test.info("Navigating to login page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		
		test.info("adding username");

		loginpage.addusername("Admin");
		test.info("adding password");
		loginpage.addPassword("admin123");
		test.info("clicking logion Button");
		loginpage.clickLoginButton();
		// loginpage.login("Admin", "admin123");
		test.info("checking home page");
		test.skip("skipping this test");
		throw new SkipException("Skip Exception");
//		homepage.clickTimelink();
//		test.info("all tests completed");
		


	}
	@Test
	public void LoginTest4() {
		//creating objects for pages
		LoginPage loginpage = new LoginPage(page);
		HomePage homepage = new HomePage(page);
		test.info("Navigating to login page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		
		test.info("adding username");

		loginpage.addusername("Admin");
		test.info("adding password");
		loginpage.addPassword("admin123");
		test.info("clicking logion Button");
		loginpage.clickLoginButton();
		// loginpage.login("Admin", "admin123");
		test.info("checking home page");
		//homepage.clickTimelink();
		test.info("all tests completed");


	}
	

}
