package com.script;

import org.testng.annotations.Test;

import com.library.BaseClass;
import com.library.GenericClass;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProductPage;

public class ToastMessage extends BaseClass {
	
	
	@Test(priority=1,enabled=true,description="Login to abof application and verify the Toast MEESAGE")
	public void verifYToastMessage() throws Exception{
		LoginPage login=new LoginPage(driver);
		HomePage home=new HomePage(driver);
		ProductPage product=new ProductPage(driver);
		try{
			login.AbofUserNameTextBox.sendKeys("abofqa.raghucbt@gmail.com");
			handlekeyboad();
			login.AbofPasswordTextBox.sendKeys("raghukiran92");
			handlekeyboad();
			Thread.sleep(3000);
			login.AbofSignButton.click();
			Thread.sleep(4000);
			home.AbofMenTab.click();
			Thread.sleep(4000);
			home.abofNewInOption.get(1).click();
			Thread.sleep(4000);
			home.abofClothingIcon.click();
			Thread.sleep(4000);
			product.abofFavIcon.click();
			String Text=GenericClass.verifyToastMessage(driver);
			System.out.println(Text);
			Thread.sleep(4000);
		}catch(Exception e){
			throw e;
		}
			
	}
	

}
