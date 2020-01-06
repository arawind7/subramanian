package arawind;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class js {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("document.getElementById('txtUsername').setAttribute('value','Admin')");
js.executeScript("document.getElementById('txtPassword').setAttribute('value','admin123')");
WebElement x= driver.findElement(By.id("btnLogin"));
js.executeScript("arguements[0].click()", x);
js.executeScript("window.scrollBy(0,300)");
}
	}
