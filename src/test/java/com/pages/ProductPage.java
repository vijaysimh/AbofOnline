package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ProductPage {
	
AndroidDriver driver;
	
	public ProductPage(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="com.abof.android:id/img_filter")
	public WebElement abofFilterIcon;
	
	@FindBy(id="com.abof.android:id/prduct_name")
	public List<WebElement> abofProductName;
	
	@FindBy(id="com.abof.android:id/product_img_view")
	public List<WebElement> abofImageIcon;
	
	@FindBy(name="L")
	public WebElement sizechart;
	
	@FindBy(name="ADD TO BAG")
	public WebElement AddToBag;
	
	@FindBy(xpath="//android.widget.ImageButton[@index='0']")
	public WebElement Back;
	
	@FindBy(xpath="//android.widget.RelativeLayout[@index='1']//android.view.View[@index='0']//android.widget.ImageButton[@index='0']")
	public WebElement prdtBack;

	//Come to main page
	//Clothing
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='2']//android.widget.RelativeLayout[@index='0']")
	public WebElement productAccessories;
	
	@FindBy(id="com.abof.android:id/cart_icn")
	public WebElement Cart;
	
	@FindBy(id="com.abof.android:id/itemEditView")
	public WebElement CartEdit;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='1']//android.widget.Spinner[@index='0']")
	public WebElement SizeChange;
	
	@FindBy(name="S")
	public WebElement SelectSmall;
	
	//Update 'S'
	@FindBy(name="Update")
	public WebElement Update;
	
	
	
	
	
	
   // Home page - For getting count of products and sum must matches with View all.
	//Clothing
	@FindBy(name="Clothing")
	public WebElement Clothing;
		
	@FindBy(name="31 products found")
	public WebElement Prdts31;
	
	//Footwear
	@FindBy(name="Footwear")
	public WebElement Footwear;
	
	@FindBy(name="125 products found")
	public WebElement Prdts125;
	
	//Accessories
	@FindBy(name="Accessories")
	public WebElement Accessories;
	
	@FindBy(name="4 products found")
	public WebElement Prdts4;
	
	//View All
	@FindBy(name="View All")
	public WebElement ViewAll;
	
	@FindBy(name="160 products found")
	public WebElement Prdts160;
	
	
	
     //View Bag
	@FindBy(id="com.abof.android:id/btnViewBag")
	public WebElement viewBag;
	//Place Order
	@FindBy(id="com.abof.android:id/button_place_order")
	public WebElement placeOrder;
	
	//Deliver to this address
	@FindBy(id="com.abof.android:id/deliver_address")
	public WebElement DeliverAddress;

	//DragToEnd
	@FindBy(xpath="//android.widget.RelativeLayout[@index='2']//android.widget.FrameLayout[@index='0']//android.widget.ImageView[@index='0']")
	public WebElement ScrollToElement;
	
	
	//ToastMessage
	@FindBy(id="com.abof.android:id/fave_img_view")
	public WebElement abofFavIcon;
	




	

	


}
