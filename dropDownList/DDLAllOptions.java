package dropDownList;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDLAllOptions {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Files\\Browser Servers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");

		WebElement monthDDL = driver.findElement(By.id("month"));
		Select monthSct = new Select(monthDDL);

		List<WebElement> options = monthSct.getOptions();
		int size = options.size();
		for (int i = 0; i < size; i++) {
			WebElement option = options.get(i);
			String text = option.getText();
			System.out.println(text);
		}
	}

}