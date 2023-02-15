package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
ChromeDriver driver;	
	
	@Given("Load browser and enter URL")
	public void load_browser_and_enter_URL() {
	    WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("Enter username as DemoCSR")
	public void enter_username_as_DemoCSR() {
	    driver.findElementById("username").sendKeys("DemoCSR");
	}

	@Given("Enter password as crmsfa")
	public void enter_password_as_crmsfa() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Click login button")
	public void click_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Click CRMSFA link")
	public void click_CRMSFA_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Click CreatLead link")
	public void click_CreatLead_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Enter Companyname as (.*)")
	public void enter_Companyname_as_cname(String cname) {
	    driver.findElementById("createLeadForm_companyName").sendKeys(cname);
	}

	@When("Enter First Name as (.*)")
	public void enter_First_Name_as_fname(String fname) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Enter Last name as (.*)")
	public void enter_Last_name_as_lname(String lname) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Choose Direct Mail as Source")
	public void choose_Direct_Mail_as_Source() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Click Creat Lead link button")
	public void click_Creat_Lead_link_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


}
