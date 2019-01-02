package com.tns.prueba.steps;

import static org.junit.Assert.assertEquals;

import java.util.List;

import com.tns.prueba.pages.AddBooksPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class AddBooksStep {
	
	private AddBooksPage addBooksPage = new AddBooksPage(); 


	@And("seleccione la cantidad de libros")
	public void seleccioneLaCantidadDeLibros(DataTable dataTable) {

		List<List<String>> cantidadesPorLibro = dataTable.raw();
		String coreJavaQuantity = cantidadesPorLibro.get(1).get(1);
		String rubyForRailsQuantity = cantidadesPorLibro.get(2).get(1);
		String pythonCookbookQuantity = cantidadesPorLibro.get(3).get(1);
		
		addBooksPage.addQuantityBooks(coreJavaQuantity, rubyForRailsQuantity, pythonCookbookQuantity);
		
	}

	@And("los agregue al carro de compras")
	public void losAgregueAlCarroDeCompras() throws Throwable {
		addBooksPage.addToShoppingCar();
	}

	@Then("^deberia ver un gran total de \"([^\"]*)\"$")
	public void deberiaVerUnGranTotalDe(String totalExpected) throws Throwable {
		assertEquals(totalExpected, addBooksPage.getGrandTotal()); 
	}


}
