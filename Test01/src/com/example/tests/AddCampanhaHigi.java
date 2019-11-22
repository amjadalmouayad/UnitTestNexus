package com.example.tests;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class AddCampanhaHigi {
	package com.example.tests;

	import java.util.regex.Pattern;
	import java.util.concurrent.TimeUnit;
	import org.testng.annotations.*;
	import static org.testng.Assert.*;
	import org.openqa.selenium.*;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	public class UntitledTestCase {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "https://www.katalon.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testUntitledTestCase() throws Exception {
	    driver.get("http://10.3.0.209/ncall/main.php");
	    driver.findElement(By.name("btnAddCamp")).click();
	    driver.findElement(By.id("nome")).click();
	    driver.findElement(By.id("nome")).clear();
	    driver.findElement(By.id("nome")).sendKeys("NexDiscaHigi01");
	    new Select(driver.findElement(By.id("idcusto"))).selectByVisibleText("Raiz");
	    driver.findElement(By.id("idcusto")).click();
	    new Select(driver.findElement(By.id("gruporota"))).selectByVisibleText("Padrão");
	    driver.findElement(By.id("gruporota")).click();
	    new Select(driver.findElement(By.id("tipo"))).selectByVisibleText("Higienizador");
	    driver.findElement(By.id("tipo")).click();
	    new Select(driver.findElement(By.id("idmediaserver"))).selectByVisibleText("MS1");
	    driver.findElement(By.id("idmediaserver")).click();
	    driver.findElement(By.id("maxsimult")).click();
	    driver.findElement(By.id("maxsimult")).clear();
	    driver.findElement(By.id("maxsimult")).sendKeys("20");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Utilizar Portabilidade'])[1]/following::div[2]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Descartar'])[1]/following::button[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Voltar'])[1]/following::button[1]")).click();
	    new Select(driver.findElement(By.id("idcampanhaestrategia"))).selectByVisibleText("Horizontal");
	    driver.findElement(By.id("idcampanhaestrategia")).click();
	    new Select(driver.findElement(By.id("acaoposatend"))).selectByVisibleText("Finalizar Contato");
	    driver.findElement(By.id("acaoposatend")).click();
	    new Select(driver.findElement(By.id("tentativas"))).selectByVisibleText("2");
	    driver.findElement(By.id("tentativas")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[23]/following::div[1]")).click();
	    new Select(driver.findElement(By.id("tempotoque"))).selectByVisibleText("30");
	    driver.findElement(By.id("tempotoque")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[24]/following::div[1]")).click();
	    new Select(driver.findElement(By.id("tempotoquecelular"))).selectByVisibleText("30");
	    driver.findElement(By.id("tempotoquecelular")).click();
	    new Select(driver.findElement(By.id("tempostsoc"))).selectByVisibleText("5 Minutos");
	    driver.findElement(By.id("tempostsoc")).click();
	    new Select(driver.findElement(By.id("tempostsna"))).selectByVisibleText("5 Minutos");
	    driver.findElement(By.id("tempostsna")).click();
	    new Select(driver.findElement(By.id("tempostsse"))).selectByVisibleText("Detec. Desativada");
	    driver.findElement(By.id("tempostsse")).click();
	    new Select(driver.findElement(By.id("tempostsco"))).selectByVisibleText("5 Minutos");
	    driver.findElement(By.id("tempostsco")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[28]/following::div[1]")).click();
	    new Select(driver.findElement(By.id("tempostsse"))).selectByVisibleText("5 Minutos");
	    driver.findElement(By.id("tempostsse")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Voltar'])[2]/following::button[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Voltar'])[3]/following::button[1]")).click();
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	}

}
