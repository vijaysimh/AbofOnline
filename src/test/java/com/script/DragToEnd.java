package com.script;


import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.library.BaseClass;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProductPage;

public class DragToEnd extends BaseClass
{
    Dimension dSize;
    LoginPage loginpage;
	HomePage homepage;
	ProductPage productpage;

	@Test
	public void DragToEnd() throws Exception{

           
           loginpage=new LoginPage(driver);
           homepage=new HomePage(driver);
	
			loginpage.AbofCloseIcon.click();
			Thread.sleep(5000);
			homepage.AbofMenTab.click();
			Thread.sleep(3000);
			
			for(int i=1;i<=5;i++)
			{
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			 scroll(0.5, 0.2);		
			}
			
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			 boolean flag=driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='2']//android.widget.FrameLayout[@index='0']//android.widget.ImageView[@index='0']")).isDisplayed(); 

		  if(flag)
           {
			  driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='2']//android.widget.FrameLayout[@index='0']//android.widget.ImageView[@index='0']")).click();
           }
		  else
		   {
			  System.out.println("end");
		   }
			 
			 
			/*scroll(0.5, 0.2);
			
			  flag=driver.findElementByXPath("//android.widget.RelativeLayout[@index='2']//android.widget.FrameLayout[@index='0']//android.widget.ImageView[@index='0']").isDisplayed();
		          if(flag==true)
	           {
			driver.findElementByXPath("//android.widget.RelativeLayout[@index='2']//android.widget.FrameLayout[@index='0']//android.widget.ImageView[@index='0']").click();
	           }*/
					
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
	
/*	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}*/
}

			
