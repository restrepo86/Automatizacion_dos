package com.tns.prueba.steps;

import static org.junit.Assert.assertEquals;

import java.util.List;

import com.tns.prueba.pages.LoginPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	private LoginPage loginPage = new LoginPage();
	
	@Given("^Que he ingresado a la pagina \"(.*)\"$")
	public void openPage(String url) {
		loginPage.navigateTo(url);
	}
	
	@And("he Ingresado nombre de usuario y Password")
	public void setForm(DataTable dataTable) {
		List<List<String>> datos = dataTable.raw();
		loginPage.setUser(datos.get(1).get(0));
		loginPage.setPassword(datos.get(1).get(1));
	}
	
	@When("de click en el boton login")
	public void clickButton() {
		loginPage.clickButton();
	}
	
	@Then("deberia acceder al aplicativo")
	public void getResult() {
		assertEquals(loginPage.getResultPage(), "Books");
		loginPage.close();
	}
	
}

