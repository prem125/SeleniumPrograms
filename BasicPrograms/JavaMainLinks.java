package BasicPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaMainLinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Files\\Browser Servers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Java", Keys.ENTER);
		List<WebElement> javalinks = driver.findElements(By.xpath("//h2[contains(text(),'Web result')]/..//div/div/div/div/a/h3"));
		int size = javalinks.size();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement link;
		for (int i = 0; i <= size - 1; i++) {
			System.err.println(i);
			link = javalinks.get(i);
			link.click();
			String title = driver.getTitle();
			System.out.println(title);
			driver.navigate().back();
			wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//h2[contains(text(),'Web result')]/..//div/div/div/div/a/h3"))));
			javalinks  = driver.findElements(By.xpath("//h2[contains(text(),'Web result')]/..//div/div/div/div/a/h3"));
		}
		driver.close();
	}
	
}
