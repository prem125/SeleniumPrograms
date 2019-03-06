package BasicPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerify {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Files\\Browser Servers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.google.com");
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		String expectedTitle = "Google";
		if(actualtitle.equals(expectedTitle))
		{
			System.out.println("It is a Google Page");
		}
		else
		{
			System.out.println("It is not Google Page");
		}
		
		driver.close();
	}

}
