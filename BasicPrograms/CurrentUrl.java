package BasicPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Files\\Browser Servers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.gmail.com");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.close();
	}

}
