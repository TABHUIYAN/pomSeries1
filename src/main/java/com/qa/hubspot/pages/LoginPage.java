package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.hubspot.base.BasePage;

public class LoginPage extends BasePage {

	//. By locators: OR (= OBJECT REPOSITRIES)
	private By emailid=By.name("e");
	private By password=By.name("p");
	private By loginButton=By.xpath("//*[text()=\"Log in\"]");
	private By signUpLink=By.xpath("//*[text()=\"Sign up\"]");
	
	//2. Constructor of the page class
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	// 3. Page Actions: features (Behavior) of the page in the form methods:
	public String getLoginPageTitle() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return driver.getTitle();
	}
	
	public boolean signUpLinkExist() {
		return driver.findElement(signUpLink).isDisplayed();
	}
	public void doLogin(String un,String pwd) {
		System.out.println("Login with : "+ un +"and "+pwd);
		driver.findElement(emailid).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginButton).click();
	}
}
