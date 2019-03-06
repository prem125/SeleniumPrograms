package BasicPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoSuchElementException;


public class ExceptionHandling1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Files\\Browser Servers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");

		try
		{
		driver.findElement(By.id("gs-htif0")).sendKeys("Selenium");
		}
		catch(NoSuchElementException e)
		{
			driver.findElement(By.name("q")).sendKeys("Selenium");
		}
		finally
		{
			driver.close();
		}
		System.out.println("Ended");
		
	}

}
