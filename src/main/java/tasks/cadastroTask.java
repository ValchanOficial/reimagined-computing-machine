package tasks;

import org.openqa.selenium.WebDriver;
import appObject.cadastroAppObject;

public class cadastroTask {
	private cadastroAppObject cadastroAppObject;
	
	public cadastroTask(WebDriver driver) {
		this.cadastroAppObject = new cadastroAppObject(driver);
	}
	public void preencherCadastro(String nome, String email, String senha, String confSenha, String telefone, String cidade) {
		this.cadastroAppObject.getNomeCompletoTextField().sendKeys(nome);
		this.cadastroAppObject.getEmailTextField().sendKeys(email);
		this.cadastroAppObject.getSenhaTextField().sendKeys(senha);
		this.cadastroAppObject.getConfSenhaTextField().sendKeys(confSenha);
		this.cadastroAppObject.getTelefoneTextField().sendKeys(telefone);
		this.cadastroAppObject.getCidadeComboBox().sendKeys(cidade);
	}
	public void enviarFormulario() {
		this.cadastroAppObject.getCadastrarButton().click();
	}
}