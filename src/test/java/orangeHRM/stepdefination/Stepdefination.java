package orangeHRM.stepdefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import orangeHRM.Page.Page;
import orangeHRM.startbrowser.StartBrowser;

public class Stepdefination extends StartBrowser{
	
	@Given("user hits the application URL")
	public static void openbrowser()
	{
		StartBrowser.startbrowser();
	}
	@When("^user enters the username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_the_username_and_password(String username, String password) 
	{
		Page.username(username);
		Page.password(password);
	}

	@And("^user hits the login button$")
	public void user_hits_the_login_button() 
	{
		Page.loginbutton();
	}
	@Then("user should see the login name as expected")
	public static void loginusername()
	{
		Page.loginname();
	}

}
