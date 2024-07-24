package com.NovemberProject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinUsingBaseclass extends BaseclassForAdactin{

	static void AdactinHotelRegister() throws InterruptedException {
		getDriver("chrome");
		maxi();
		getUrl("https://adactinhotelapp.com/");

		dr.findElement(By.xpath("//a[contains(text(),'New')]")).click();
		sleep(3);
		dr.findElement(By.name("username")).sendKeys("Suresh1501");
		dr.findElement(By.id("password")).sendKeys("Tamilan@123");
		dr.findElement(By.name("re_password")).sendKeys("Tamilan@123");
		dr.findElement(By.name("full_name")).sendKeys("Suresh Arumugam");
		dr.findElement(By.id("email_add")).sendKeys("tamizhansuresharumugam@gmail.com");
		sleep(3);
		// Scanner sc = new Scanner(System.in);
		// String capcha = sc.nextLine();
		dr.findElement(By.id("ct-captcha")).sendKeys("provedor");
		dr.findElement(By.name("tnc_box")).click();
		sleep(3);
		dr.findElement(By.name("Submit")).click();
	}

	static void AdactinHotelBooking() throws InterruptedException, IOException {
		getDriver("chrome");
		maxi();
		getUrl("https://adactinhotelapp.com/");
		sleep(3);

//		dr.findElement(By.name("username")).sendKeys("Suresh1501");
//		dr.findElement(By.id("password")).sendKeys("Tamilan@123");
		LoginPage lp = new LoginPage(dr);
		sendkeysInput(lp.getUserName(), "Suresh1501");
		sendkeysInput(lp.getPassword(), "Tamilan@123");
		sleep(2);
//		dr.findElement(By.name("login")).click();
		lp.getLogin().click();
		sleep(3);
		// Search Hotel
		WebElement loc = dr.findElement(By.name("location"));
		Select seloc = new Select(loc);
		seloc.selectByIndex(8);
		WebElement hotls = dr.findElement(By.xpath("(//select[@class='search_combobox'])[2]"));
		Select sehot = new Select(hotls);
		sehot.selectByIndex(3);
		WebElement roomtpe = dr.findElement(By.xpath("(//select[@class='search_combobox'])[3]"));
		Select rmtpe = new Select(roomtpe);
		rmtpe.selectByVisibleText("Deluxe");
		WebElement noofrooms = dr.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));
		Select rmnos = new Select(noofrooms);
		rmnos.selectByValue("2");
		dr.findElement(By.name("datepick_in")).clear();
		dr.findElement(By.name("datepick_in")).sendKeys("10/11/2022");
		dr.findElement(By.id("datepick_out")).clear();
		dr.findElement(By.id("datepick_out")).sendKeys("13/11/2022");
		WebElement adlts = dr.findElement(By.xpath("(//select[@class='search_combobox'])[5]"));
		Select adlt = new Select(adlts);
		adlt.selectByValue("2");
		WebElement children = dr.findElement(By.xpath("(//select[@class='search_combobox'])[6]"));
		Select child = new Select(children);
		child.selectByIndex(2);
		sleep(5);
		dr.findElement(By.xpath("//input[@value='Search']")).click();
		// Continue
		dr.findElement(By.xpath("//input[@type='radio']")).click();
		sleep(5);
		dr.findElement(By.name("continue")).click();
		// Booking window
		dr.findElement(By.name("first_name")).sendKeys("Suresh");
		dr.findElement(By.id("last_name")).sendKeys("Arumugam");
		dr.findElement(By.name("address")).sendKeys("No. 11B, Lakshmanan Nagar East Street, Peravallur, Chennai - 82");
		dr.findElement(By.xpath("(//input[@class='reg_input'])[3]")).sendKeys("1234567890101112");
		WebElement creditcardtype = dr.findElement(By.xpath("//select[@class='select_combobox']"));
		Select cardtype = new Select(creditcardtype);
		cardtype.selectByIndex(2);
		WebElement selmonth = dr.findElement(By.xpath("(//select[@class='select_combobox2'])[1]"));
		Select month = new Select(selmonth);
		month.selectByIndex(12);
		WebElement selyear = dr.findElement(By.xpath("(//select[@class='select_combobox2'])[2]"));
		Select year = new Select(selyear);
		year.selectByVisibleText("2022");
		dr.findElement(By.xpath("(//input[@class='reg_input'])[4]")).sendKeys("067");
		sleep(5);
		dr.findElement(By.name("book_now")).click();
		sleep(10);
		// dr.findElement(By.name("my_itinerary")).click();
		dr.findElement(By.xpath("//a[text()='Booked Itinerary']")).click();
		sleep(5);
		// Booked page Screenshot
		screenShot("AdactinBooking");
		sleep(5);
		// Cancellation
		// dr.findElement(By.xpath("(//input[@type='button'])[1]")).click();
		dr.findElement(By.id("check_all")).click();
		dr.findElement(By.name("cancelall")).click();
		sleep(5);
		// Alert handling
		alertAccept();
		// Cancellation page Screenshot
		sleep(5);
		screenShot("AdactinCancellation");
		sleep(30);
		quit();
	}

	public static void main(String[] args) throws Exception {
		// AdactinHotelRegister();
		AdactinHotelBooking();
	}

}
