package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class booking {

	public static WebDriver driver;

	@Given("Open the Application")
	@Test
	public void open_application() {
		System.out.println("open_application");

	}
	@Given("do Login")
	@Test
	public void login() {
		driver.findElement(By.xpath("//a[@href='login']")).click();
		driver.findElement(By.xpath("//input[@name='email_id']")).sendKeys("user@user.com");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("user");
		driver.findElement(By.xpath("//button")).click();
		System.out.println("do Login");
	}

	@Given("go to Home")
	@Test
	public void home() {
		driver.findElement(By.xpath("//a[@href='home']")).click();
		System.out.println("go to home");
	}
	@When("Select {string} as source and {string} as destination")
	@Test
	public void select_as_source_and_as_destination(String source, String destination) {
		driver.findElement(By.xpath("//select[@name='source']")).sendKeys(source);
		driver.findElement(By.xpath("//select[@name='destination']")).sendKeys(destination);
		driver.findElement(By.xpath("//button")).click();
		driver.findElement(By.xpath("//a[@href='bookflight?id=7']")).click();

	}
	@When("User books flight")
	@Test
	public void user_books_flight() {
		driver.findElement(By.xpath("//a[@href='completepurchase']")).click();
		System.out.println("User books flight");
	}

	@Then("Use completes booking")
	@Test
	public void use_completes_booking() {
		driver.findElement(By.xpath("//a[@href='memberbookings']")).click();
		System.out.println("User completes booking");
	}
}