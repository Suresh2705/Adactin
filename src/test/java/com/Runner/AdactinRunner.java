package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.NovemberProject.BaseclassForAdactin;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Feature\\Adactin.feature",
glue = "com.StepDefinition")

public class AdactinRunner {
	public static WebDriver dr = null;
	
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"T:\\GreensTechnology\\eclipse-workspace\\NovemberProject\\ChromeDriver\\chromedriver.exe");
		dr = new ChromeDriver();
//dr = new ChromeDriver();
		//dr = BaseclassForAdactin.getDriver("chrome");

	}
	@AfterClass
	public static void tearsDown() {
		dr.close();

	}

}
