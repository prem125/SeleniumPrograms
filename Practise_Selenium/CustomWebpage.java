package Practise_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class CustomWebpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Files\\Browser Servers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Selenium%20Workspace/Html%20Webpage/Webpage.html");
		WebElement element = driver.findElement(By.xpath("file:///D:/Selenium%20Workspace/Html%20Webpage/Webpage.html"));
	Actions act = new Actions(driver);
	act.moveToElement(element).click().perform();
	}

}
