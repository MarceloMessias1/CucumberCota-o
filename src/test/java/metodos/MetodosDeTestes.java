package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import drivers.DriversFactory;

public class MetodosDeTestes extends DriversFactory {

	/**
	 * 
	 * 
	 * Metodo para clicar em um elemento web passando By
	 * 
	 * @param elemento
	 */

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	/**
	 * Metodo para clicar em um elemento web passando WebElement
	 * 
	 * @param elemento
	 */

	public void clicar(WebElement elemento) {
		elemento.click();

	}

	public void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void preencherLast(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	/**
	 * Metodo para digitar um texto no elemento passando o By
	 * 
	 * @param elemento
	 * @param texto
	 */

	public void digitar(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void digitarFrom(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	/**
	 * Metodo para digitar um texto no elemento passando o WebElemento
	 * 
	 * @param elemento
	 * @param texto
	 */

	public void digitar(WebElement elemento, String texto) {
		elemento.sendKeys(texto);
	}

	/**
	 * Valida se o texto capturado contém o texto esperado passando um By
	 * 
	 * @param elemento
	 * @param textoEsperado
	 */

	public void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		// assertTrue(textoCapturado.contains(textoEsperado));
		assertEquals(textoEsperado, textoCapturado);
	}

	/**
	 * Tirar uma evidencia do teste executado
	 * 
	 * @param nomeEvidencia
	 * @throws IOException
	 */
	public void screenShot(String nomeEvidencia) throws IOException {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
		FileUtils.copyFile(srcFile, destFile);

	}

	/**
	 * Pausar aplicação pelo tempo determinado em milisegundos
	 * 
	 * @param tempo
	 * @throws InterruptedException
	 */
	public void pausa(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}

}
