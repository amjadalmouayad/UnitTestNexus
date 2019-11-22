package com.example.tests;

//import java.util.regex.Pattern;

import org.testng.annotations.*;
import org.openqa.selenium.*;

public class LoginTest {
  public boolean acceptNextAlert = true;
  public StringBuffer verificationErrors = new StringBuffer();
	OpenDrivers nexus = new OpenDrivers();
	
  @Test
  public void testBetaLogin() throws Exception {
	nexus.nexusLogin();
	
	nexus.driver.findElement(By.id("usuario")).clear();
	nexus.driver.findElement(By.id("usuario")).sendKeys("__amjad.mouyad");
	nexus.driver.findElement(By.name("senhaLogin")).clear();
	nexus.driver.findElement(By.name("senhaLogin")).sendKeys("Pa$$w0rd@mts");
	nexus.driver.findElement(By.id("bt_senha")).click();
  }

}
