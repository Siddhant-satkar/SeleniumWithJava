package selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {
	
	public static void main(String args[] ) {
		
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://bluepoint.elevateqa.cafe/bluepointnet/content2/dashboard");
	
	// 1st approch - need to create an another object
	
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Username")));
	
	// 2nd Approch without creating the object
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	
	WebElement txtbx_username = driver.findElement(By.id("Username"));
	
	txtbx_username.sendKeys("siddhant.satkar@yardi.com");
	
	WebElement txtbx_password = driver.findElement(By.id("txtPassword"));
	
	txtbx_password.sendKeys("HareKrishna@108");
	
	WebElement txtbx_login = driver.findElement(By.id("loginbtn"));
	
	txtbx_login.click();
	
	// Maximizing the browser screen
	
	driver.manage().window().maximize();
	
	// Checking whether the login has been done successful or not
	
	String expected_title = "Bluepoint";
	String dash_title=driver.getTitle();
	
	if(dash_title.equals("expected_title")) {
		System.out.println("Login Successful");
	}else {
		System.out.println("Login Failed");
	}
	
	//driver.close();
	//driver.quit(); 	*/
	
	}
}
