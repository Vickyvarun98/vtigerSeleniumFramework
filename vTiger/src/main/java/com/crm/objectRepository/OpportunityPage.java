package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunityPage {
	
	public OpportunityPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//img[@title='Create Opportunity...']")
	private WebElement 	createOpportunityImg;

	public WebElement getCreateOpportunityImg() {
		return createOpportunityImg;
	}
	

	
}
