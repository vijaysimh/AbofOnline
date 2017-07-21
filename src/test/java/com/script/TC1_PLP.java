package com.script;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.library.BaseClass;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProductPage;
import com.pages.filterpage;

import io.appium.java_client.android.AndroidDriver;

//User with No Saved Card
//1. Launch abof android app and login
//2. Add item to cart and place order
//3. Choose delivery address and continue
//4. Choose any of the payment options from Payment method
//5. Enter card details in the payment page"

public class TC1_PLP extends BaseClass
{
	LoginPage loginpage;
	HomePage homepage;
	ProductPage productpage;
	filterpage filterpag;
	
	@Test
	public void TC1_PLP() throws Exception{
		loginpage=new LoginPage(driver);
		homepage=new HomePage(driver);
		productpage=new ProductPage(driver);
		filterpag=new filterpage(driver);
		
		try{
			//Login using Uname and Pass
			loginpage.AbofUserNameTextBox.sendKeys("abofqa.raghucbt@gmail.com");
			handlekeyboad();
			Thread.sleep(4000);
			loginpage.AbofPasswordTextBox.sendKeys("raghukiran92");
			handlekeyboad();
			Thread.sleep(4000);
			loginpage.AbofSignButton.click();
			Thread.sleep(4000);
			
			//Post Login click on Men tab
			homepage.AbofMenTab.click();
			Thread.sleep(2000);
			homepage.abofNewInOption.get(1).click();
			Thread.sleep(2000);
			homepage.abofClothingIcon.click();
			Thread.sleep(1000);
			productpage.abofImageIcon.get(1).click();
			Thread.sleep(1000);
			
	
        }
		catch (Exception e) {
			throw e;
		}
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
	
}
