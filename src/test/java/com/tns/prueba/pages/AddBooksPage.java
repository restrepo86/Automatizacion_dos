package com.tns.prueba.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddBooksPage {
	
	public AddBooksPage() {
		PageFactory.initElements(DriverUtil.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[@id=\"listing\"]/tbody/tr[2]/td[4]/input")
	private WebElement coreJavaBookTextQuantity;
	
	@FindBy(xpath = "//*[@id=\"listing\"]/tbody/tr[3]/td[4]/input")
	private WebElement rubyForRailsBookTextQuantity;
	
	@FindBy(xpath = "//*[@id=\"listing\"]/tbody/tr[4]/td[4]/input")
	private WebElement pythonCookBookTextQuantity;
	
	@FindBy(xpath = "//*[@id=\"available\"]/input[1]")
	private WebElement addToShoppingCarButton;
	
	@FindBy(xpath = "//*[@id=\"total\"]")
	private WebElement grandTotalTest;
	
	
	public void addQuantityBooks(String coreJavaBookQuantity, String rubyForRairlsBookQuantity, String pythonCookBookQuantity) {
		coreJavaBookTextQuantity.sendKeys(coreJavaBookQuantity);
		rubyForRailsBookTextQuantity.sendKeys(rubyForRairlsBookQuantity);
		pythonCookBookTextQuantity.sendKeys(pythonCookBookQuantity);
	}
	
	public void addToShoppingCar() {
		addToShoppingCarButton.click();
	}
	
	public String getGrandTotal() {
		return grandTotalTest.getAttribute("value");
	}
	
}
