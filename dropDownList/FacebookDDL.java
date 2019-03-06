package dropDownList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDDL {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Files\\Browser Servers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		//for month
		WebElement monthDDL = driver.findElement(By.id("month"));
		Select monthSct = new Select(monthDDL);
		monthSct.selectByIndex(3);
		//for day
		WebElement dayDDL = driver.findElement(By.id("day"));
		Select daySct = new Select(dayDDL);
		daySct.selectByValue("16");
		//for year
		WebElement yearDDL = driver.findElement(By.id("year"));
		Select yearSct = new Select(yearDDL);
		yearSct.selectByVisibleText("1989");
		Thread.sleep(5000);
		
		driver.close();
				
	}
}
