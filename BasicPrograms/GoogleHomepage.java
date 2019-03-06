package BasicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomepage {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Files\\Browser Servers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.linkText("Gmail")).click();
		
		/*WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Java");
		Thread.sleep(2000);
		element.clear();
		Thread.sleep(2000);
		element.sendKeys("Selenium With Java");
		Thread.sleep(2000);
		element.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(2000);
		element.sendKeys("I am the Master of Automation");
		Thread.sleep(2000)
		driver.close();*/
	}

}
