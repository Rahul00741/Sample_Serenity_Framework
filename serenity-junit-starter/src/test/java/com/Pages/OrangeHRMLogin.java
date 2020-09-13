package com.Pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class OrangeHRMLogin extends PageObject{
	

	 
	
	
	public void loginTitle() {
		
		String title = getDriver().getTitle();
		System.out.println(title);
//		Assert.assertTrue(title.contains("OrangeHRM"));
	}
	
	public void enterUnameAndPassword() {
		
		
		$(By.id("txtUsername")).type("Admin");
		$(By.id("txtPassword")).typeAndEnter("admin123");
	}
	
//	public void enterPwordAndLogin() {
//
//		passward.typeAndEnter("admin123");
//	}
	
	public void gettitlepage() {
		
		String current_URL=getDriver().getCurrentUrl();
		Assert.assertTrue(current_URL.contains("dashboard"));
	}
	
	public void teardown() {
		
		getDriver().close();
	}


}
