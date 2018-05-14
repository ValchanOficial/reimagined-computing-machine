package testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import verificationPoints.LoginVerificationPoint;

public class LoginTestCase {
	private WebDriver driver;
	private LoginVerificationPoint verificationPoint;
	
	@Before
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();;//configura para o navegador
		//baixa dependencias antes do teste
		this.driver = new FirefoxDriver();//ChromeDriver ou qualquer navegador
		this.driver.get("http://demo.virtuemart.net/");//referencia site a ser testado
		this.verificationPoint = new LoginVerificationPoint(driver);
	}
	@Test
	public void testMain() {
		WebElement usernameTextField = this.driver.findElement(By.id("modlgn-username"));
		WebElement passwordTextField = this.driver.findElement(By.id("modlgn-passwd"));
		usernameTextField.sendKeys("demo");
		passwordTextField.sendKeys("demo");
		this.driver.findElement(By.cssSelector("input.button:nth-child(3)")).click();
		this.verificationPoint.checkHello();
	}
	
	@After
	public void tearDown() {
		this.driver.quit();
	}
}