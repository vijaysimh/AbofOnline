package com.library;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.AppiumDriver;
import net.sourceforge.tess4j.*;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class GenericClass {
	
	public static String configprop=BaseClass.sDirpath+"\\config.properties";
	static Dimension dSize;
	
	
	//READ data from the config.properties
	
	public static String getdataproperties(String key){
		
		String svalue=null;
		Properties properties=new Properties();
		
		try{
			
				FileInputStream file=new FileInputStream(configprop);
				properties.load(file);
				svalue=properties.getProperty(key);
			
		}catch(Exception e){
			
		}
		return svalue;
		
	}
	
	//swipe condtion
	public static void swipe(double startx,double endx){
		
		dSize=BaseClass.driver.manage().window().getSize();
		System.out.println(dSize);
		int STARTX=(int)(dSize.width*startx);
		System.out.println(STARTX);
		int ENDX=(int)(dSize.width*endx);
		System.out.println(ENDX);
		int starty=dSize.height/2;
		System.out.println(starty);
		
		BaseClass.driver.swipe(STARTX, starty, ENDX, starty, 3000);
		
	}
	
	//VERIFY THE TOAST MESSAGE
	public static String verifyToastMessage(AppiumDriver driver) throws IOException, TesseractException {
		String result = null;
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:/eclipse workspace/screenshots_tessaract/screen1.png"));

	 //  File srcfile = driver.getScreenshotAs(OutputType.FILE);

		ITesseract instance = new Tesseract();
		try {
			result = instance.doOCR(src);
		} catch (TesseractException e) {
			
			throw e;
		}
		return result;
	}

}
