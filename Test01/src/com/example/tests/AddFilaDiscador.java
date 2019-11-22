package com.example.tests;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class AddFilaDiscador {


	  public boolean acceptNextAlert = true;
	  public StringBuffer verificationErrors = new StringBuffer();
	  LoginTest nexus1 = new LoginTest();
	  	  
	  @Parameters("browser")
	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/home/dev-homolg/eclipse-workspace/Test01/drivers/chromedriver");
	  }

	  @Test
	  public void testUntitledTestCase() throws Exception {
		  
		    nexus1.testBetaLogin();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
	    nexus1.nexus.driver.get("http://10.3.0.208/ncall/main.php");
	    nexus1.nexus.driver.findElement(By.name("btnAddCamp")).click();
	    nexus1.nexus.driver.findElement(By.id("nome")).click();
	    nexus1.nexus.driver.findElement(By.id("nome")).clear();
	    nexus1.nexus.driver.findElement(By.id("nome")).sendKeys("amjad1234");
	    nexus1.nexus.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Utilizar Portabilidade'])[1]/following::div[2]")).click();
	    new Select(nexus1.nexus.driver.findElement(By.id("idcusto"))).selectByVisibleText("Raiz");
	    nexus1.nexus.driver.findElement(By.id("idcusto")).click();
	    nexus1.nexus.driver.findElement(By.id("idgrupo")).click();
	    new Select(nexus1.nexus.driver.findElement(By.id("gruporota"))).selectByVisibleText("Padrão");
	    nexus1.nexus.driver.findElement(By.id("gruporota")).click();
	    new Select(nexus1.nexus.driver.findElement(By.id("tipo"))).selectByVisibleText("Fila de Atendimento");
	    nexus1.nexus.driver.findElement(By.id("tipo")).click();
	    new Select(nexus1.nexus.driver.findElement(By.id("idfila"))).selectByVisibleText("NexFilaDisca01 - 1");
	    nexus1.nexus.driver.findElement(By.id("idfila")).click();
	    nexus1.nexus.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Descartar'])[1]/following::button[1]")).click();
	    nexus1.nexus.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Voltar'])[1]/following::button[1]")).click();
	    new Select(nexus1.nexus.driver.findElement(By.id("idcampanhaestrategia"))).selectByVisibleText("Horizontal");
	    nexus1.nexus.driver.findElement(By.id("idcampanhaestrategia")).click();
	    new Select(nexus1.nexus.driver.findElement(By.id("tipodiscador"))).selectByVisibleText("Progressive");
	    nexus1.nexus.driver.findElement(By.id("tipodiscador")).click();
	    new Select(nexus1.nexus.driver.findElement(By.id("tentativas"))).selectByVisibleText("1");
	    nexus1.nexus.driver.findElement(By.id("tentativas")).click();
	    new Select(nexus1.nexus.driver.findElement(By.id("maxdescartes"))).selectByVisibleText("1");
	    nexus1.nexus.driver.findElement(By.id("maxdescartes")).click();
	    new Select(nexus1.nexus.driver.findElement(By.id("tempotoque"))).selectByVisibleText("30");
	    nexus1.nexus.driver.findElement(By.id("tempotoque")).click();
	    new Select(nexus1.nexus.driver.findElement(By.id("tempotoquecelular"))).selectByVisibleText("30");
	    nexus1.nexus.driver.findElement(By.id("tempotoquecelular")).click();
	    new Select(nexus1.nexus.driver.findElement(By.id("tipoagendamento"))).selectByVisibleText("Para o Agente");
	    nexus1.nexus.driver.findElement(By.id("tipoagendamento")).click();
	    nexus1.nexus.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Voltar'])[2]/following::button[1]")).click();
	    nexus1.nexus.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Voltar'])[3]/following::button[1]")).click();
	    nexus1.nexus.driver.findElement(By.name("btnAddFila")).click();
	    new Select(nexus1.nexus.driver.findElement(By.id("idTipoFila"))).selectByVisibleText("Ramal");
	    nexus1.nexus.driver.findElement(By.id("idTipoFila")).click();
	    new Select(nexus1.nexus.driver.findElement(By.id("idTipoFilaRamal"))).selectByVisibleText("Discador");
	    nexus1.nexus.driver.findElement(By.id("idTipoFilaRamal")).click();
	    nexus1.nexus.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancelar'])[1]/following::button[1]")).click();
	    nexus1.nexus.driver.findElement(By.id("ramal")).click();
	    nexus1.nexus.driver.findElement(By.id("ramal")).clear();
	    nexus1.nexus.driver.findElement(By.id("ramal")).sendKeys("2008");
	    nexus1.nexus.driver.findElement(By.id("name")).click();
	    nexus1.nexus.driver.findElement(By.id("name")).clear();
	    nexus1.nexus.driver.findElement(By.id("name")).sendKeys("NexFilaDisca01");
	    nexus1.nexus.driver.findElement(By.id("weight")).click();
	    new Select(nexus1.nexus.driver.findElement(By.id("weight"))).selectByVisibleText("10");
	    nexus1.nexus.driver.findElement(By.id("weight")).click();
	    new Select(nexus1.nexus.driver.findElement(By.id("cc"))).selectByVisibleText("RAIZ");
	    nexus1.nexus.driver.findElement(By.id("cc")).click();
	    new Select(nexus1.nexus.driver.findElement(By.id("strategy"))).selectByVisibleText("Aleatório");
	    nexus1.nexus.driver.findElement(By.id("strategy")).click();
	    nexus1.nexus.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ativar Callback de Abandonos'])[1]/following::div[4]")).click();
	    nexus1.nexus.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ativar Callback de Abandonos'])[1]/following::label[3]")).click();
	    nexus1.nexus.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Descartar'])[1]/following::button[1]")).click();
	    new Select(nexus1.nexus.driver.findElement(By.id("maxagspausa"))).selectByVisibleText("10%");
	    nexus1.nexus.driver.findElement(By.id("maxagspausa")).click();
	    nexus1.nexus.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Usuários na Fila'])[1]/following::i[1]")).click();
	    new Select(nexus1.nexus.driver.findElement(By.id("timeout"))).selectByVisibleText("19");
	    nexus1.nexus.driver.findElement(By.id("timeout")).click();
	    nexus1.nexus.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Criar Fila Discador'])[1]/following::label[1]")).click();
	    new Select(nexus1.nexus.driver.findElement(By.id("timeoutfila"))).selectByVisibleText("00:08");
	    nexus1.nexus.driver.findElement(By.id("timeoutfila")).click();
	    nexus1.nexus.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Criar a Fila'])[1]/following::label[1]")).click();
	    nexus1.nexus.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Voltar'])[1]/following::button[1]")).click();
	    nexus1.nexus.driver.findElement(By.name("motivos_pausa[104]")).click();
	    nexus1.nexus.driver.findElement(By.name("motivos_pausa[102]")).click();
	    nexus1.nexus.driver.findElement(By.name("motivos_pausa[198]")).click();
	    nexus1.nexus.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Voltar'])[2]/following::button[1]")).click();
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
		  nexus1.nexus.driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }
	}



