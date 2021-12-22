package Stepdefinitions;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static ExtentTest logger;
	public static ExtentReports report;
	@Before
	public void beforeallscenario() {
		System.setProperty("webdriver.chrome.driver", "C:\\installables\\chromedriver96.exe");
		booking.driver = new ChromeDriver();
		booking.driver.get("http://localhost:8081/FlyAway/");
		
	}
	@Before
	public void startReport() {
		report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReport.html");
		System.out.println(System.getProperty("user.dir")+"//ExtentReport1.html");
		report.addSystemInfo("Host Name","CISCO");
		report.addSystemInfo("Environment","TESTING");
		report.addSystemInfo("User Name","CHETAN KUMAR(chetaku2@cisco.com)");

		report.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));

	}
	
	@After
	public void afterallscenario() {
		// TODO Auto-generated method stub

	}

}
