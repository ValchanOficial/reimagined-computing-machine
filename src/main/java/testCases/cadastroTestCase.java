package testCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.cadastroTask;

public class cadastroTestCase {
	private WebDriver driver;
	private cadastroTask cadastro;
	
	@Before
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		this.driver = new FirefoxDriver();
		this.driver.get("http://www.xiru.rs/d/trocas/homolog/usuarios/cadastrar");
		this.driver.manage().window().maximize();
		this.cadastro = new cadastroTask(driver);
	}
	@Test
	public void testMain() {
		this.cadastro.preencherCadastro("Valchan", "valchan@teste.com.br", "senhateste", "senhateste", "5199999999", "Porto Alegre, RS");
		this.cadastro.enviarFormulario();
	}
	@After
	public void tearDown() {
		this.driver.quit();
	}
}