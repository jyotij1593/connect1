package com.StepDef;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Repository.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	private Base automation=Base.getInstances();
	static WebDriver driver;
		
	@Given("The user is in connect login page")
	public void the_user_is_in_connect_login_page() throws MalformedURLException {
		 driver=automation.openBrowser();
	}
	
	@When("The user click the login button")
	public void the_user_click_the_login_button() {
	    driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/input")).click();
	}

	@Given("The user enter username as {string} and password as {string}")
	public void the_user_enter_username_as_and_password_as(String s1, String s2) throws InterruptedException, MalformedURLException {
		WebElement element1=driver.findElement(By.id("LoginForm_username"));
		element1.sendKeys(s1);
		WebElement element2=driver.findElement(By.id("LoginForm_password"));
		element2.sendKeys(s2);	
		
		
	}
	
	@Then("The user enter to connect homepage")
	public void the_user_enter_to_connect_homepage() {
	    driver.navigate().to("https://connect.maveric-systems.com/index.php/site/index");
	}
	
	@Then("click the logout button")
	public void click_the_logout_button() throws InterruptedException {
		Actions ac=new Actions(driver);
	    WebElement element3=driver.findElement(By.xpath("//a[contains(text(),'Welcome')]"));
	    ac.moveToElement(element3).clickAndHold().build().perform();
	    Thread.sleep(2000);
	    WebElement element4=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
	    ac.moveToElement(element4).click().build().perform();
	  
	}  
	    
	@Then("The user quit the connect")
	public void the_user_quit_the_connect() {
		//service.stop();
	    driver.close();
	}
}
