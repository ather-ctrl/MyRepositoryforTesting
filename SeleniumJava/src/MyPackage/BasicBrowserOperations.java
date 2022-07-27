package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

//Form
public class BasicBrowserOperations {

	public static WebDriver driver;  //Reference variablce 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		 driver = new ChromeDriver(); // ClassName obj = new ClassName();
		 driver.get("https://www.selenium.dev/downloads/"); //faster
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.quit();
	}

}
