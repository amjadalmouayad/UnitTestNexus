// in this class can be set the address link by the variable 'URL' under the nexusLogin function will open the URL 

package com.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class OpenDrivers {
	  public WebDriver driver;
	  public boolean acceptNextAlert = true;
	  public StringBuffer verificationErrors = new StringBuffer();
	  public String URL = "http://10.3.0.208/ncall/main.php?inicio=1";
	  

	  
	  
	  @Test
	public void nexusLogin() throws Exception {
			System.setProperty("webdriver.chrome.driver", "/home/dev-homolg/eclipse-workspace/Test01/drivers/chromedriver");
		    driver = new ChromeDriver();
		    // open the URL test link 
		    driver.get(URL);
	}

		
}
