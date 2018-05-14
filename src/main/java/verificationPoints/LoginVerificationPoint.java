package verificationPoints;

import org.openqa.selenium.WebDriver;
public class LoginVerificationPoint {
	
	private WebDriver driver;
	public LoginVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}
		//verificationPoint
		public void checkHello() {
			if(this.driver.getPageSource().contains("The entered EU-VAT-ID is valid")) {
				System.out.print("Entrou");
			}else {
				System.out.print("Falhou");
			}
			//verificaçãoComAssertTrue - assertTrue(this.driver.getPageSource().contains("The entered EU-VAT-ID is valid"));
	}
}
