package com.script;

import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.library.BaseClass;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProductPage;
import com.pages.filterpage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidDriver;

public class LocateElementAndClick extends BaseClass
{
	static Dimension dSize;

	LoginPage loginpage;
	HomePage homepage;
	ProductPage productpage;
	filterpage filterpag;
	
	@Test
	public void LocateElementAndClick() throws Exception{
		loginpage=new LoginPage(driver);
		homepage=new HomePage(driver);
		productpage=new ProductPage(driver);
		filterpag=new filterpage(driver);
		
		try{
			//Login using Uname and Pass
			Thread.sleep(5000);
			loginpage.AbofCloseIcon.click();
			
			Thread.sleep(5000);
			loginpage.AbofOkay.click();
			
			Thread.sleep(5000);
			homepage.AbofMenTab.click();
			
			/*
			Thread.sleep(5000);
			homepage.abofNewInOption.get(1).click();

			Thread.sleep(5000);
			homepage.abofClothingIcon.click();
				
			productpage.abofImageIcon.get(1).click();
			Thread.sleep(1000);
		    */
			Thread.sleep(4000);

            MobileElement menTab = (MobileElement) driver.
        		            findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
        				  +  ".resourceId(\"com.abof.android:id/landing_viewpager\")).scrollIntoView("
        	     	      +  "new UiSelector().index(2));");
          menTab.click();
          Thread.sleep(2000);			

        //android.widget.RelativeLayout[@index='2']//android.widget.FrameLayout[@index='0']//android.widget.ImageView[@index='0']                        
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
