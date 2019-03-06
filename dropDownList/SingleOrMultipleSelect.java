package dropDownList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleOrMultipleSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Files\\Browser Servers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		WebElement yearDDL = driver.findElement(By.id("year"));
		Select sct = new Select(yearDDL);
		
		boolean status = sct.isMultiple();
		if(status==true)
		{
			System.out.println("Multi Select Drop Down List");
		}
		else
		{
			System.out.println("Single Select Drop Down List");
		}
		driver.close();   
	}

}
