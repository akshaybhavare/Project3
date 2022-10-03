package com.test;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.pom.LogInPage;

import Utility.BaseClass;

public class Verify_LogInTest extends BaseClass{
	@Test
	public void verify_LogInwithValidData() {
		
		LogInPage login=PageFactory.initElements(driver, LogInPage.class);
		login.getEmailid().sendKeys("aaaaaa");
//		login.getEmailid().sendKeys(excel.getStringData("Sheet1", 0, 0));
//		login.getPasswored().sendKeys(excel.getStringData("Sheet1", 1, 0));
//		System.out.println(excel.getStringData("Sheet1", 0, 0));
	}
}
