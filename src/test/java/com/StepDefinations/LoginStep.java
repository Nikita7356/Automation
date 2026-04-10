package com.StepDefinations;

import io.cucumber.java.en.Given;

public class LoginStep {

	@Given("Browser is opened and login page is launched")
	public void openBrowserAndLaunchedURL()
	{
		OpenBrowser(App.getBrowserName());
		launchUrl(App.getAppUrl("qa"));
	}
	
	@When("User enter invalid credentials")
	public void enterInvalidCredentails()
	{
		LoginPage login = new LoginPage();
		login.enterUserName("Admin");
		
		
	}
	

}
