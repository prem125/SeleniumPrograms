package Practise_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleStatic_Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Files\\Browser Servers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Java");
		driver.findElement(By.xpath("(//input[@name='btnK'])[1]")).click();
		driver.close();
	}

}
