package Practise_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Selenium Files\\Browser Servers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	}
}
