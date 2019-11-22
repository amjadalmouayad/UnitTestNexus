package com.example.tests;

import org.testng.annotations.*;

import com.example.tests.DatabaseConnection.Testdbpg;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class AddCampanhaFila extends GeneralVar {
	

  public boolean acceptNextAlert = true;
  public StringBuffer verificationErrors = new StringBuffer();
  LoginTest nexus1 = new LoginTest();
  Testdbpg checkCusto = new Testdbpg();
  
  public String NOMECAMPANHA = "AutoCampanha13";
  public String IDFILA = "NexFilaDisca02 - 4";
  public String ccName = "Nexcore";
  
  

  @Test
  public void testUntitAddCmpFila() throws Exception {

	checkCusto.getFIlaNome(ccName, 2);
//	checkInfo.etapa1();
    nexus1.testBetaLogin();

    
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	// 
	
	nexus1.nexus.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Canais GSM'])[1]/following::a[1]")).click();
	nexus1.nexus.driver.findElement(By.linkText("Campanhas")).click();
	nexus1.nexus.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Discador'])[2]/following::a[2]")).click();
	nexus1.nexus.driver.findElement(By.name("btnAddCamp")).click();
	
	// NAME OF CAMPANAHA

	nexus1.nexus.driver.findElement(By.id("nome")).click();
	nexus1.nexus.driver.findElement(By.id("nome")).clear();
	nexus1.nexus.driver.findElement(By.id("nome")).sendKeys(NOMECAMPANHA);
	
	
	// check info do campo Nome 
	if (nexus1.nexus.driver.findElement(By.xpath("//*[@id=\"step-1\"]/div/div[2]/div[1]/div/div[2]/label/i")).getAttribute("data-original-title").equals(infoNomeAddCamp)){
		System.out.println("*** Matched info do campo Nome ***");
		} else {
			System.out.println("+-+-+- Not Matched info do campo Nome -+-+-+" + nexus1.nexus.driver.findElement(By.xpath("//*[@id=\"step-1\"]/div/div[2]/div[1]/div/div[2]/label/i")).getAttribute("data-original-title"));

		}
	
	// SET CENTRO DE CUSTO
	nexus1.nexus.driver.findElement(By.id("idcusto")).click();
    new Select(nexus1.nexus.driver.findElement(By.id("idcusto"))).selectByVisibleText(ccName);
    nexus1.nexus.driver.findElement(By.id("idcusto")).click();
    
    
	// check info do campo CENTRO DE CUSTO 
	if (nexus1.nexus.driver.findElement(By.xpath("//*[@id=\"step-1\"]/div/div[2]/div[1]/div/div[3]/label/i")).getAttribute("data-original-title").equals(infoCustoAddCamp)){
		System.out.println("*** Matched info do campo CENTRO DE CUSTO ***");
		} else {
			System.out.println("+-+-+- Not Matched info do CENTRO DE CUSTO -+-+-+" + nexus1.nexus.driver.findElement(By.xpath("//*[@id=\"step-1\"]/div/div[2]/div[1]/div/div[3]/label/i")).getAttribute("data-original-title"));

		}
	
    
    // Set GRUPO ROTA
    nexus1.nexus.driver.findElement(By.id("idgrupo")).click();
    nexus1.nexus.driver.findElement(By.id("gruporota")).click();
    new Select(nexus1.nexus.driver.findElement(By.id("gruporota"))).selectByVisibleText("Padrão");
    nexus1.nexus.driver.findElement(By.id("gruporota")).click();
    
    // SET TYPE OF CAMPANHA
    new Select(nexus1.nexus.driver.findElement(By.id("tipo"))).selectByVisibleText("Fila de Atendimento");
    
    // WAIT TO  REFRESH THE LIST OF FILA
    try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    // check lista das filas de acordo com o centro de cusro 
    WebElement dropdown = nexus1.nexus.driver.findElement(By.id("idfila"));    
    Select select = new Select(dropdown); 
    java.util.List<WebElement> options = select.getOptions(); 
    for(WebElement item:options) 
    {
    	for (int i=0; i<checkCusto.asfilas; i++){
    			if (item.getText().equals(checkCusto.listaFila[i])){
    				System.out.println(item.getText() + "  Matched");
    				}
    		}
    	}
    
    //
    
    // SET A FILA
    new Select(nexus1.nexus.driver.findElement(By.id("idfila"))).selectByVisibleText(IDFILA);
    
    
    // CLICK BUTTON 'AVANÇAR'
    nexus1.nexus.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Descartar'])[1]/following::button[1]")).click();
	
    // TIME WAIT UNTIL OPEN THE SECUND STEP
    try {
		Thread.sleep(8000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    // REFRESH PAGE 'STEP 2' ADDING MAILING FILE
	nexus1.nexus.driver.navigate().refresh();
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	// CLICK BUTTON 'AVANÇAR'
    nexus1.nexus.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Voltar'])[1]/following::button[1]")).click();

	try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
    
	// Definir Estratégia 'Step 3'
	
	// * Estratégia de Discagem
    new Select(nexus1.nexus.driver.findElement(By.id("idcampanhaestrategia"))).selectByVisibleText("Horizontal");
    nexus1.nexus.driver.findElement(By.id("idcampanhaestrategia")).click();
    
    // * Tipo de Discador
    new Select(nexus1.nexus.driver.findElement(By.id("tipodiscador"))).selectByVisibleText("Progressive");
    nexus1.nexus.driver.findElement(By.id("tipodiscador")).click();
    
    // * Número máximo de tentativas por telefone [1 -> 4]
    new Select(nexus1.nexus.driver.findElement(By.id("tentativas"))).selectByVisibleText("1");
    nexus1.nexus.driver.findElement(By.id("tentativas")).click();
    
    // * Núm. máx. de descartes de fila (por número) [0 -> 10]
    new Select(nexus1.nexus.driver.findElement(By.id("maxdescartes"))).selectByVisibleText("1");
    nexus1.nexus.driver.findElement(By.id("maxdescartes")).click();
    
    // * Tempo de toque (Fixo) [1 > 30]
    new Select(nexus1.nexus.driver.findElement(By.id("tempotoque"))).selectByVisibleText("30");
    nexus1.nexus.driver.findElement(By.id("tempotoque")).click();
    
    // * Tempo de toque (Celular) [1 -> 30]
    new Select(nexus1.nexus.driver.findElement(By.id("tempotoquecelular"))).selectByVisibleText("30");
    nexus1.nexus.driver.findElement(By.id("tempotoquecelular")).click();
    
    // * Retorno de Agendamentos do Agente [Para o Agente, Para o Agente/Fila]
    new Select(nexus1.nexus.driver.findElement(By.id("tipoagendamento"))).selectByVisibleText("Para o Agente");
    nexus1.nexus.driver.findElement(By.id("tipoagendamento")).click();
    
    // Click Button 'Avançar'
    nexus1.nexus.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Voltar'])[2]/following::button[1]")).click();
    
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
	//Estratégias Avançadas 'Etapa 4'
	
	//Click Button 'Adicionar'
    nexus1.nexus.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Voltar'])[3]/following::button[1]")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
//    nexus1.nexus.driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }



}
