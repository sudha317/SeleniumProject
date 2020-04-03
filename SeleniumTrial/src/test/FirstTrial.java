package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.SessionNotCreatedException;


public class FirstTrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   System.setProperty("webdriver.chrome.driver","C://Selenium Files//Chromedriver_win321//Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@name='login' and @value='Login']")).click();
		/*WebDriverWait wait = new WebDriverWait(driver,30);
		/*driver,close();
		 
		 */
		/*driver.findElement(By.name("Departing From")).sendKeys("53920");*/
		/*driver.findElement(By.xpath("//*[contains(text(),'Arriving ')]")).dropdown.selectByValue("prog");*/
		Select dropdown = new Select(driver.findElement(By.name("fromPort")));
		dropdown.selectByVisibleText("London");
		Select dropdown1 = new Select(driver.findElement(By.name("toPort")));
		dropdown1.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Business']")).click();
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		
		
				
	}

}
