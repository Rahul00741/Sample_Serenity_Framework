package com.Step;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Pages.OrangeHRMLogin;

import net.serenitybdd.junit.runners.SerenityRunner;

import net.thucydides.core.annotations.Step;



public class LoginPage_Step {

	OrangeHRMLogin login;
	
	@Step("This step will varify the title")
	public void verifyTitle(){
		login.loginTitle();
	}
	
	@Step("This steps allow us to give logincredentials")
	public void verifyCredentials() {
		login.enterUnameAndPassword();

	}
	
	@Step("This step will verify the dashboard")
	public void verifyDashboard() {
		login.gettitlepage();
	}
	
	
//	@Managed
//	WebDriver driver;
//	
//	@Steps
//	OrangeHRMLogin OrangeLogin;
//
//	@Test
//	public void loginAsAdmin() {
//		driver.get("");
//		OrangeLogin.loginTitle();
//		OrangeLogin.enterUname();
//		OrangeLogin.enterPwordAndLogin();
//		OrangeLogin.gettitlepage();
//		OrangeLogin.teardown();
//	}

}
