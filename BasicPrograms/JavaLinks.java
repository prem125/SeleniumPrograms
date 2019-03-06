
package BasicPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Files\\Browser Servers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.google.com");
		driver.findElement(By.name("q")).sendKeys("Java",Keys.ENTER);
	List<WebElement> element = driver.findElements(By.xpath("//a/h3"));
	int size=element.size();
	for(int i=0; i<size;i++)
	{
		WebElement ele=element.get(i);
		String data=ele.getText();
		System.out.println(data);
	}
		
		
		driver.close();
	}

}
