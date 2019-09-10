package Selenium.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	static WebDriver driver;
	public static void LaunchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
		 driver=new ChromeDriver();
		 driver.get(url);
	}
	public static void type(WebElement loc,String input) {
		loc.sendKeys(input);
	}
	public static void click(WebElement loc) {
		
	loc.click();
	}
	public static void HotelOption(WebElement loc,int index) {
		Select drop=new Select(loc);
		drop.selectByIndex(index);
		
	}
	public static void closeBrowser() {
		driver.quit();

	}
}
