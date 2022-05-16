package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import elementos.ElementosWeb;
import metodos.MetodosDeTestes;

public class AdicionarUsuarioPage {
	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb elemento = new ElementosWeb();

	By addUsuario = By.xpath("//a[@href='/v1.x/demo/bootstrap_theme_v4/add']");
	By btnSalvar = By.xpath("//button[@id='form-button-save']");
	By msg = By.xpath("//div[@id='report-success']/p");
	By preencherNome = By.xpath("//*[@id='field-customerName']");
	By preencherLast = By.xpath("//*[@id=\"field-contactLastName\"]");
	By preencherContact = By.xpath("//*[@id=\"field-contactFirstName\"]");
	By preencherPhone = By.xpath("//*[@id=\"field-phone\"]");
	By preencherAddres1 = By.xpath("//*[@id=\"field-addressLine1\"]");
	By preencherAddres2 = By.xpath("//*[@id=\"field-addressLine2\"]");
	By preencherCity = By.xpath("//*[@id=\"field-city\"]");
	By preencherState = By.xpath("//*[@id=\"field-state\"]");
	By preencherCode = By.xpath("//*[@id=\"field-postalCode\"]");
	By preencherCountry = By.xpath("//*[@id=\"field-country\"]");
	By preencherCredit = By.xpath("//*[@id=\"field-creditLimit\"]");
	By preencherDelete = By.xpath("//*[@id=\"field-deleted\"]");

	public void selecionarVersao(String versao) {

		metodos.digitar(elemento.versao, versao);

	}

	public void addUsuario() {

		metodos.clicar(addUsuario);
	}

	public void preencherCampos(String preencher) {
		metodos.digitar(preencherNome, preencher);

	}

	public void preencherDelete(String preencher) {
		metodos.digitar(preencherDelete, preencher);

	}

	public void preencherCountry(String preencher) {
		metodos.digitar(preencherCountry, preencher);

	}

	public void preencherCredit(String preencher) {
		metodos.digitar(preencherCredit, preencher);
	}

	public void preencherPhone(String preencher) {
		metodos.digitar(preencherPhone, preencher);
	}

	public void preencherCode(String preencher) {
		metodos.digitar(preencherCode, preencher);
	}

	public void preencherAddres1(String preencher) {
		metodos.digitar(preencherAddres1, preencher);
	}

	public void preencherState(String preencher) {
		metodos.digitar(preencherState, preencher);
	}

	public void preencherCity(String preencher) {
		metodos.digitar(preencherCity, preencher);
	}

	public void preencherAddres2(String preencher) {
		metodos.digitar(preencherAddres2, preencher);
	}

	public void preencherLast(String preencher) {
		metodos.digitar(preencherLast, preencher);
	}

	public void preencherContact(String preencher) {
		metodos.digitar(preencherContact, preencher);
	}

	public void salvar() {
		metodos.clicar(btnSalvar);
	}

	public void validarMensagem(String addUsuario) throws IOException, InterruptedException {
		metodos.pausa(3000);
		metodos.validarTexto(msg, addUsuario);
		metodos.screenShot("Ct01 - Adicionar Usuario");

	}

}
