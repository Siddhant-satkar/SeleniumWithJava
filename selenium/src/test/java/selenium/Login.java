package selenium;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public String baseUrl = "https://bluepoint.elevateqa.cafe/bluepointnet/content2/dashboard";
	public WebDriver driver;

	@BeforeTest
	public void setup() {

		System.out.println("Before Test executed");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	@Test
	public void loginTest() {

		/*
		 * driver.findElement(By.xpath("//input[@id='Username']")).sendKeys(
		 * "siddhant.satkar@yardi.com");
		 * driver.findElement(By.xpath("(//input[@id='txtPassword'])[1]")).sendKeys(
		 * "HareKrishna@108");
		 * driver.findElement(By.xpath("//button[@id='loginbtn']")).submit();
		 */
		WebElement txtbx_username = driver.findElement(By.id("Username"));
		
		txtbx_username.sendKeys("siddhant.satkar@yardi.com");
		
		WebElement txtbx_password = driver.findElement(By.id("txtPassword"));
		
		txtbx_password.sendKeys("HareKrishna@108");
		
		WebElement txtbx_login = driver.findElement(By.id("loginbtn"));
		
		txtbx_login.click();
		
		String pageTitle = driver.getTitle();
		
		  if(pageTitle.equalsIgnoreCase("BluePoint")) {
			  System.out.println("Login Sucessfull");
		  }else {
			  System.out.println("Login Failed");
		  }
		 
		//Assert.assertEquals("Bluepoint", pageTitle);
	}
	
	public void logOut() {
		driver.findElement(By.xpath("//div[@class='user-menu-mobile dropdown']")).click();
		driver.findElement(By.cssSelector("ul[class='fade-in-right dropdown-menu show'] fa-icon[class='ng-fa-icon mr-1']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
	}
	@AfterTest
	public void tearDown() throws InterruptedException{

		Thread.sleep(10000);
		
		logOut();
		driver.close();
		driver.quit();
	}














	/*
	 * public static void main(String[] args) {
	 * 
	 * ChromeDriver driver = new ChromeDriver();
	 * 
	 * driver.get("https://bluepoint.elevateqa.cafe/bluepointnet/content2/dashboard");
	 * 
	 * 
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 * 
	 * driver.manage().window().maximize(); }
	 */

}
