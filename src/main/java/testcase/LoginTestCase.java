package testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
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
		
		
	}
	
	@After
	public void tearDown() {
		this.driver.quit();
	}
	
}