package testcase;

import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCase {
	private WebDriver driver;
	
	@Before
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();;//configura para o navegador
		//baixa dependencias antes do teste
		this.driver = new FirefoxDriver();//ChromeDriver ou qualquer navegador
		this.driver.get("http://demo.virtuemart.net/");//referencia site a ser testado
	}
	@Test
	public void testMain() {
		WebElement usernameTextField = this.driver.findElement(By.id("modlgn-username"));
		WebElement passwordTextField = this.driver.findElement(By.id("modlgn-passwd"));
		usernameTextField.sendKeys("demo");
		passwordTextField.sendKeys("demo");
		this.driver.findElement(By.cssSelector("input.button:nth-child(3)")).click();
		//verificationPoint
		if(this.driver.getPageSource().contains("The entered EU-VAT-ID is valid")) {
			System.out.print("Entrou");
		}else {
			System.out.print("Falhou");
		}
		//verificaçãoComAssertTrue
		assertTrue(this.driver.getPageSource().contains("The entered EU-VAT-ID is valid"));
	}
	@After
	public void tearDown() {
		this.driver.quit();
	}
}