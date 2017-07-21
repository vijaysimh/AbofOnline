package com.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
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

public class TC3_PLP extends BaseClass
{
	static Dimension dSize;

	LoginPage loginpage;
	HomePage homepage;
	ProductPage productpage;
	filterpage filterpag;
	
	@Test
	public void TC3_PLP() throws Exception{
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
			Thread.sleep(2000);
			for(int i=0;i<3;i++)
			{
			scroll(0.5, 0.2);			
	    	}
			productpage.abofImageIcon.get(5).click();
			Thread.sleep(2000);
        }
		catch (Exception e) {
			throw e;
		}
	}
	
	//Y axis 
	public  void scroll(double starty,double endy)
  {
		//Size is DimensionSize
		dSize=BaseClass.driver.manage().window().getSize();
		System.out.println(dSize);
		int STARTY=(int)(dSize.width*starty);
		System.out.println(STARTY);
		int ENDY=(int)(dSize.width*endy);
		System.out.println(ENDY);
		int startx=dSize.width/2; //Xaxis is width
		System.out.println(startx);
		BaseClass.driver.swipe(startx, STARTY, startx, ENDY, 2000);
   }

	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
	
}
