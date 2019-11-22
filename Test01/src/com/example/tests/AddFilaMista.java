package com.example.tests;

public class AddFilaMista {

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
	    driver.findElement(By.name("btnAddFila")).click();
	    new Select(driver.findElement(By.id("idTipoFila"))).selectByVisibleText("Ramal");
	    driver.findElement(By.id("idTipoFila")).click();
	    new Select(driver.findElement(By.id("idTipoFilaRamal"))).selectByVisibleText("Mista (Receptiva e Ativa)");
	    driver.findElement(By.id("idTipoFilaRamal")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancelar'])[1]/following::button[1]")).click();
	    driver.findElement(By.id("ramal")).click();
	    driver.findElement(By.id("ramal")).clear();
	    driver.findElement(By.id("ramal")).sendKeys("2007");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[1]/following::div[1]")).click();
	    driver.findElement(By.id("name")).click();
	    driver.findElement(By.id("name")).clear();
	    driver.findElement(By.id("name")).sendKeys("NexFilaMista01");
	    new Select(driver.findElement(By.id("weight"))).selectByVisibleText("10");
	    driver.findElement(By.id("weight")).click();
	    new Select(driver.findElement(By.id("cc"))).selectByVisibleText("RAIZ");
	    driver.findElement(By.id("cc")).click();
	    new Select(driver.findElement(By.id("strategy"))).selectByVisibleText("Aleatório");
	    driver.findElement(By.id("strategy")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Descartar'])[1]/following::button[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Usuários na Fila'])[1]/following::i[1]")).click();
	    new Select(driver.findElement(By.id("maxagspausa"))).selectByVisibleText("100%");
	    driver.findElement(By.id("maxagspausa")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Voltar'])[1]/following::button[1]")).click();
	    driver.findElement(By.name("motivos_pausa[104]")).click();
	    driver.findElement(By.name("motivos_pausa[102]")).click();
	    driver.findElement(By.name("motivos_pausa[198]")).click();
	    driver.findElement(By.name("motivos_pausa[102]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Voltar'])[2]/following::button[1]")).click();
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
