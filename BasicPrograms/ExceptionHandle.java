package BasicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Files\\Browser Servers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		try
		{
			driver.findElement(By.tagName("mmx22")).click();
		}
		catch(NoSuchElementException e)
		{
			e.printStackTrace();
			driver.close();
			System.out.println("Ended");
		}
		
	}

}
