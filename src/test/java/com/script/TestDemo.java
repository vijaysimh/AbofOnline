package com.script;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.library.BaseClass;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProductPage;
import com.pages.filterpage;
import com.thoughtworks.selenium.webdriven.commands.GetValue;

public class TestDemo extends BaseClass{
	
	
	LoginPage loginpage;
	HomePage homepage;
	ProductPage productpage;
	filterpage filterpag;
	
	@Test
	public void swipeabofapplication() throws Exception{
		loginpage=new LoginPage(driver);
		homepage=new HomePage(driver);
		productpage=new ProductPage(driver);
		filterpag=new filterpage(driver);
		try{
			Thread.sleep(5000);
			loginpage.AbofCloseIcon.click();
			Thread.sleep(5000);
			loginpage.AbofOkay.click();
			Thread.sleep(3000);
			homepage.AbofMenTab.click();
			Thread.sleep(2000);
			homepage.abofNewInOption.get(1).click();
			Thread.sleep(2000);
			homepage.abofClothingIcon.click();
			Thread.sleep(3000);
				
					
		   // Home page - For getting count of 4 Clothing,Foot wear,Accessories and sum must matches with View all.
           //Clothing
			String str=productpage.Prdts31.getText();
			String numberClothing=str.replaceAll("[^0-9]", "");

			System.out.println(numberClothing);
			Thread.sleep(3000);
			
			productpage.prdtBack.click();
			Thread.sleep(2000);
			
			//Footwear
			productpage.Footwear.click();
			String str1=productpage.Prdts125.getText();
			String numberFootwear=str1.replaceAll("[^0-9]", "");
			
			System.out.println(numberFootwear);
			Thread.sleep(3000);
			
			productpage.prdtBack.click();
			Thread.sleep(2000);
			
			//Accessories
			productpage.Accessories.click();
			String str12=productpage.Prdts4.getText();
			String numberAccessories=str12.replaceAll("[^0-9]", "");

			System.out.println(numberAccessories);
			Thread.sleep(3000);
			
			productpage.prdtBack.click();
			Thread.sleep(4000);
			
			
			//ViewAll
			productpage.ViewAll.click();
			String str123=productpage.Prdts160.getText();
			String numberViewAll=str123.replaceAll("[^0-9]", "");

			System.out.println(numberViewAll);
			Thread.sleep(3000);
			
			//Sum All
         int Sum = Integer.parseInt(numberClothing)+ Integer.parseInt(numberFootwear)
         +Integer.parseInt(numberAccessories);
      //   System.out.println(Sum);
         System.out.println("Result:");
         if(Sum==160)
         {
        	 System.out.println("sucess");
         }
         else
         {
        	 System.out.println("Failure");
         }
         
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


