package com.script;

import org.testng.annotations.Test;

import com.library.BaseClass;
import com.library.GenericClass;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProductPage;
import com.pages.filterpage;

public class Swipe extends BaseClass {
	
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
			Thread.sleep(1000);
			productpage.abofImageIcon.get(1).click();
			Thread.sleep(1000);
			
			//Individual product
			productpage.sizechart.click();
			Thread.sleep(2000);
			productpage.AddToBag.click();
			Thread.sleep(3000);
			
			productpage.Back.click();
			Thread.sleep(4000);
			productpage.prdtBack.click();
			Thread.sleep(3000);
			productpage.productAccessories.click();
            Thread.sleep(4000);
            
            //Cart edit L size to Small
            productpage.Cart.click();
			Thread.sleep(3000);
			productpage.CartEdit.click();
			Thread.sleep(2000);
			productpage.SizeChange.click();
			Thread.sleep(2000);
			//Select Small
			productpage.SelectSmall.click();
			Thread.sleep(2000);
			productpage.Update.click();
			Thread.sleep(2000);

      

		}catch(Exception e){
			throw e;
		}
	}

}
