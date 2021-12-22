package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import net.bytebuddy.implementation.bytecode.assign.TypeCasting;

public class booking {
	
	public static WebDriver driver;
	
	@Given("Open the Application")
	@Test
	public void open_application() {
		Hooks.logger = Hooks.report.startTest("open_application");
		System.out.println("open_application");
		Hooks.logger.log(LogStatus.PASS,"open_application Has Passed");
		Hooks.report.endTest(Hooks.logger);
	}
	@Given("do Login")
	@Test
	public void do_login() {
		Hooks.logger = Hooks.report.startTest("user is doing login");
	   driver.findElement(By.xpath("//a[@href='login']")).click();
	   driver.findElement(By.xpath("//input[@name='email_id']")).sendKeys("user@user.com");
	   driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("user");
	   driver.findElement(By.xpath("//button")).click();
	   Hooks.logger.log(LogStatus.PASS,"do_login Has Passed");
		Hooks.report.endTest(Hooks.logger);
	}
	
	@Given("go to Home")
	@Test
	public void go_to_home() {
		Hooks.logger = Hooks.report.startTest("user is going homepage");
		driver.findElement(By.xpath("//a[@href='home']")).click();
		Hooks.logger.log(LogStatus.PASS,"go_to_home Has Passed");
		Hooks.report.endTest(Hooks.logger);
	}
	@When("Select {string} as source and {string} as destination")
	@Test
	public void select_as_source_and_as_destination(String source, String destination) {
		Hooks.logger = Hooks.report.startTest("user is selecting source and destination");
	   driver.findElement(By.xpath("//select[@name='source']")).sendKeys(source);
	   driver.findElement(By.xpath("//select[@name='destination']")).sendKeys(destination);
	   driver.findElement(By.xpath("//button")).click();
	   driver.findElement(By.xpath("//a[@href='bookflight?id=7']")).click();
	   Hooks.logger.log(LogStatus.PASS,"select_as_source_and_as_destination Has Passed");
		Hooks.report.endTest(Hooks.logger);
	   
	}
	@When("User books flight")
	@Test
	public void user_books_flight() {
		Hooks.logger = Hooks.report.startTest("user_books_flight");
		 driver.findElement(By.xpath("//a[@href='completepurchase']")).click();
		 Hooks.logger.log(LogStatus.PASS,"user_books_flight Has Passed");
		Hooks.report.endTest(Hooks.logger);
	}
	
	@Then("Use completes booking")
	@Test
	public void use_completes_booking() {
		Hooks.logger = Hooks.report.startTest("use_completes_booking");
		driver.findElement(By.xpath("//a[@href='memberbookings']")).click();
		Hooks.logger.log(LogStatus.PASS,"use_completes_booking Has Passed");
		Hooks.report.endTest(Hooks.logger);
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
	@AfterAll
	public void afterallscrenario() {
		//		System.out.println("close browser");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
