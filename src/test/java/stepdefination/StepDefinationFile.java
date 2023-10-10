package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.nopCom.pageObject.AdminPage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationFile extends Base {

	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() throws Exception {
	    System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    Thread.sleep(2000);
	    ad=new AdminPage(driver);
	    
	}

	@When("User open url {string}")
	public void user_opens_url(String url) throws Exception {
	  driver.get(url);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) throws Exception {
	  ad.setUserName(email);
	  ad.setPassword(password);
	  Thread.sleep(2000);
	}

	@When("Click on Login")
	public void click_on_login() {
	   ad.clickLogin();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) throws Exception {	
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
	}

	@Then("close browser")
	public void close_browser() {
	   driver.close();
	}
}
