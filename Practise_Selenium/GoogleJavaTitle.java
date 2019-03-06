package Practise_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleJavaTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Files\\Browser Servers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java",Keys.ENTER);
		driver.findElement(By.xpath("//h3[text()='Download Free Java Software']")).click();
		driver.findElement(By.xpath("//a[text()='Download']")).click();
		driver.findElement(By.linkText("What is Java?")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
