package com.library;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.kirwa.nxgreport.NXGReports;

import bsh.Capabilities;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	
	public DesiredCapabilities Capabilities;
	public static  String sDirpath=System.getProperty("user.dir");
	public String apkfilepath=sDirpath+"\\ApkFile\\abof_com.abof.android.apk";
			
	public static  AndroidDriver driver;
	/*@Test
	public void sample(){
		System.out.println(sDirpath);
	}*/
	
	@BeforeMethod
	public void setup(){
		try{
		
		Capabilities=new DesiredCapabilities();
		
		Capabilities.setCapability("automationName",GenericClass.getdataproperties("AUTOMATIONNAME"));
		Capabilities.setCapability("platformName",GenericClass.getdataproperties("PLTFORMNAME"));
		Capabilities.setCapability("deviceName",GenericClass.getdataproperties("DEVICENAME"));
		Capabilities.setCapability("platformVersion",GenericClass.getdataproperties("PLTFORMVESION"));
		Capabilities.setCapability("app",apkfilepath );
		Capabilities.setCapability("appPackage",GenericClass.getdataproperties("AppPackage")); 
		Capabilities.setCapability("appActivity",GenericClass.getdataproperties("AppActivity"));

		driver=new AndroidDriver(new URL(GenericClass.getdataproperties("APPIUMSERVERURL")), Capabilities);
		NXGReports.setWebDriver(driver);
		}catch(Exception e){
		e.printStackTrace();
	}
		
		
	}
	
	
	public void handlekeyboad(){
		try{
			driver.hideKeyboard();
			
		}catch(Exception e){
			
		}
	}
	/*
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	*/

}
