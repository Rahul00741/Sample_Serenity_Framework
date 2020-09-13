package testCases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import com.Step.LoginPage_Step;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class) 
public class LoginToOrangeHRMTestCase {
	
	@Managed
	WebDriver driver;
	
	@Steps
	LoginPage_Step Login_Step;

	@Test
	public void loginAsAdmin() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Login_Step.verifyTitle();
		Login_Step.verifyCredentials();
		Login_Step.verifyDashboard();
		
	}

}
