package dropDownList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleOrMultipleSelect1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Files\\Browser Servers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///D:/Selenium%20Workspace/Webpage/Simple%20Webpage.html");
		WebElement ddl = driver.findElement(By.xpath("//select[2]"));
		Select sct = new Select(ddl);

		boolean status = sct.isMultiple();
		if (status == true) {
			System.out.println("Multi Select Drop Down List");
		} else {
			System.out.println("Single Select Drop Down List");
		}
		driver.close();
	}

}
