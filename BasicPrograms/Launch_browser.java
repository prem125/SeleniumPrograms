package BasicPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_browser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Files\\Browser Servers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.google.com");
		driver.get("https:/www.gmail.com");
		driver.navigate().back();
		driver.navigate().forward();
		//Thread.sleep(5000);
		//driver.navigate().refresh();
		driver.close();
	}

}
