package BasicPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbTextVerify {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\\\Selenium Files\\\\Browser Servers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https:/www.facebook.com");
		WebElement text = driver.findElement(By.xpath("//span[text()='Create an account']"));
		boolean status = text.isDisplayed();
		if(status==true)
		{
			System.out.println("Text is Displayed");
		}
		else
		{
			System.out.println("Text is not displayed");
		}
		driver.close();
	}

}
