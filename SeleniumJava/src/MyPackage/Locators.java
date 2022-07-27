package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
                                           //HTML page //CSS 
public class Locators {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		 driver = new ChromeDriver(); // ClassName obj = new ClassName();
		 driver.get("https://demoqa.com/select-menu");	 
		 
		 //WebElement e = driver.findElement(By.xpath("//div[text()='Practice Form']"));
		 //e.clear();  //basic element operations
		 //e.click();
		// e.submit();
		// e.sendKeys("kjdflksdjf");
		// boolean a = e.isDisplayed();
		// boolean b = e.isEnabled();
		// boolean c = e.isSelected();
		 //System.out.println(a +" "+ b + " "+c);
		 WebElement e1 = driver.findElement(By.name("cars"));
		 Select sel = new Select(e1);
		 sel.selectByVisibleText("Volvo");
		 sel.selectByValue("saab");
		 sel.selectByIndex(3);
		 sel.deselectByVisibleText("Volvo");
		 sel.deselectByValue("saab");
		 sel.deselectByIndex(3);
		 sel.deselectAll();
		 System.out.println(sel.isMultiple());
		// driver.quit();
	}

}
