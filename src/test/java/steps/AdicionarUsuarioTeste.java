package steps;

import java.io.IOException;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import pages.AdicionarUsuarioPage;

public class AdicionarUsuarioTeste {

	AdicionarUsuarioPage addUsuario = new AdicionarUsuarioPage();

	@Dado("que esteja com boostrap v4")
	public void que_esteja_com_boostrap_v4() {
		addUsuario.selecionarVersao("Bootstrap V4 Theme");
        
	}

	@Dado("acione add customer")
	public void acione_add_customer() {
		addUsuario.addUsuario();

	}

	@Quando("salvar o formulario")
	public void salvar_o_formulario() {
		addUsuario.salvar();
		addUsuario.preencherCampos("Victor Julio ");
		addUsuario.preencherLast("Porto");
		addUsuario.preencherContact("certo");
		addUsuario.preencherPhone("(67) 3891-8212");
		addUsuario.preencherAddres1("Rua Noel Rosa");
		addUsuario.preencherAddres2("Rua Noel Rosa");
		addUsuario.preencherCity("Campo Grande");
		addUsuario.preencherState("MS");
		addUsuario.preencherCode("79013-856");
		addUsuario.preencherCountry("Brazil");
		addUsuario.preencherCredit("1000");
		addUsuario.preencherDelete("1000");
	}


	@Entao("validamos mensagem de sucesso")
	public void validamos_mensagem_de_sucesso() throws IOException, InterruptedException {
		addUsuario.validarMensagem(
				"Your data has been successfully stored into the database. Edit Customer or Go back to list");

	}

}
