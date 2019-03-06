package Practise_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWait {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Files\\Browser Servers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		//Enter e-mail id.
		driver.findElement(By.id("identifierId")).sendKeys("sssonusingh748");
		//Click on Next Button
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("Invalid",Keys.ENTER);
		driver.close();
	}
}