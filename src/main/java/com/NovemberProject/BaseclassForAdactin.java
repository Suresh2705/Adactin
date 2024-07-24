package com.NovemberProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseclassForAdactin {
	public static WebDriver dr;

	public static void getDriver(String driver) {
		if (driver.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"T:\\GreensTechnology\\eclipse-workspace\\NovemberProject\\ChromeDriver\\chromedriver.exe");
			dr = new ChromeDriver();
		} else if (driver.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver",
					"T:\\GreensTechnology\\eclipse-workspace\\NovemberProject\\ChromeDriver\\chromedriver.exe");
			dr = new ChromeDriver();			
		}
	}

	public static void maxi() {
		dr.manage().window().maximize();
	}

	public static void getUrl(String url) {
		dr.get(url);
	}

	public static void sleep(int sec) throws InterruptedException {
		sec = sec * 1000;
		Thread.sleep(sec);
	}

	public static void screenShot(String screenshotName) throws IOException {
		TakesScreenshot bkdscrshot = (TakesScreenshot) dr;
		File bkdsrc = bkdscrshot.getScreenshotAs(OutputType.FILE);
		File bkdsrcdst = new File(
				"T:\\GreensTechnology\\eclipse-workspace\\NovemberProject\\Screenshot\\" + screenshotName + ".png");
		FileUtils.copyFile(bkdsrc, bkdsrcdst);

	}

	public static void sendkeysInput(WebElement wbElmnt, String sendKeyValue) {
		wbElmnt.sendKeys(sendKeyValue);

	}

	public static void alertAccept() {
		dr.switchTo().alert().accept();
	}

	public static void quit() {
		dr.quit();
	}
}
