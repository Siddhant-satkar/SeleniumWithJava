package day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://bluepoint.elevateqa.cafe/bluepointnet/content2/dashboard");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement txtbx_username = driver.findElement(By.id("Username"));
		txtbx_username.sendKeys("siddhant.satkar@yardi.com");
		
		WebElement txtbx_password = driver.findElement(By.id("txtPassword"));
		txtbx_password.sendKeys("HareKrishna@108");
		
		WebElement txtbx_login = driver.findElement(By.id("loginbtn"));
		txtbx_login.click();
		
		//linktext and particalLinkText
		
		WebElement nav = driver.findElement(By.linkText("Users"));
		System.out.println("check");
		nav.click();
		System.out.println("check2");
		
		// ClassName
		boolean logoDisplyed = driver.findElement(By.className("ng-star-inserted")).isDisplayed();
		System.out.println(logoDisplyed);
		
		List<WebElement> headerLinks = driver.findElements(By.className("nav navbar-nav mr-auto menus"));
		System.out.println("Total Number of headers in navigation bar" + headerLinks.size());				
	}

}
