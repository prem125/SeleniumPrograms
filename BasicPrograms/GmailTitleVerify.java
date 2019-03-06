package BasicPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTitleVerify {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Files\\Browser Servers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.gmail.com");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Gmail";
		if(actualTitle.equals(expectedTitle))
			System.out.println("It is a Gmail Page");
		else
			System.out.println("It is not Gmail Page");
		driver.close();
	}

}
