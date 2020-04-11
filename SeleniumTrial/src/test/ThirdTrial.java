package test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.SessionNotCreatedException;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import org.junit.Assert;

public class ThirdTrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();  
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
	    formatter = new SimpleDateFormat("MMM dd, yyyy");  
	    String strDate = formatter.format(date);  
		 
		System.setProperty("webdriver.chrome.driver","C://Selenium Files//Chromedriver_win321//Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		String value=driver.getTitle();
		System.out.println(value);
		String expected="Welcome: Mercury Tours";
		if(value.equals(expected))
		{
			System.out.println("Welcome back text present");
		}
		else
		{
			System.out.println("Welcome back text absent");
		}
	    System.out.println("Date Format with MMMM dd  yyyy : "+strDate); 
		WebElement data=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b"));
			
		if(strDate.equals(data))
		{
			System.out.println("date is validated ");
		}
		else    
		{
			System.out.println("date is not validated ");
		}
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@name='login' and @value='Login']")).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img")));
		WebElement element1=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img"));
		if(element1.isEnabled())
		{
			System.out.println(" FlightFinder text is validated");
		}
		else
		{
			System.out.println(" Flight Finder text is not validated");
		}
		Select dropdown = new Select(driver.findElement(By.name("fromPort")));
		dropdown.selectByVisibleText("London");
		Select dropdown1 = new Select(driver.findElement(By.name("toPort")));
		dropdown1.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Business']")).click();
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		WebElement element2=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img"));
		if(element2.isEnabled())
		{
			System.out.println("Select Flight page is validated");
		}
		else
		{
			System.out.println("Select Flight page is not validated");
		}
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		WebElement element3=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img"));
		if(element3.isEnabled())
		{
			System.out.println("Book A Flight page is validated");
		}
		else	
		{
			System.out.println("Book A Flight page is not validated");
		}
		driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Peter");
		driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
		driver.close();
		
}	
}


	


