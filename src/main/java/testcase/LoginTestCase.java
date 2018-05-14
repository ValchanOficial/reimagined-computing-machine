package testcase;

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
		WebElement buttonButton = this.driver.findElement(By.cssSelector("input.button:nth-child(3)"));
				
		usernameTextField.sendKeys("demo");
		passwordTextField.sendKeys("demo");
		buttonButton.click();
		
	}
	@After
	public void tearDown() {
		this.driver.quit();
	}
}