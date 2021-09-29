package com.qa.hubspot.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.hubspot.base.BaseTest;
import com.qa.hubspot.util.Constants;

public class LoginPageTest extends BaseTest{
	
	@Test
	public void verifyLoginPageTitle() {
		String title=loginPage.getLoginPageTitle();
		System.out.println("login page title is: "+title);
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);
	}
	@Test
	public void verifySignUpLink() {
		Assert.assertTrue(loginPage.signUpLinkExist());
	}
}
