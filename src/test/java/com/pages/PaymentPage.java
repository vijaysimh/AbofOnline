package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class PaymentPage
{
	AndroidDriver driver;

	public PaymentPage(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="com.abof.android:id/closeView")
	public WebElement AbofCloseIcon;
	
	@FindBy(name="Okay,got it.")
	public WebElement AbofOkay;
	
	
	@FindBy(id="com.abof.android:id/login_email_edt")
	public WebElement AbofUserNameTextBox;
	
	@FindBy(id="com.abof.android:id/login_password_edt_edt")
	public WebElement AbofPasswordTextBox;
	
	
	@FindBy(name="Sign in")
	public WebElement AbofSignButton;
}
