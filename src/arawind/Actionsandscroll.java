package arawind;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Actionsandscroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/droppable/");
WebElement a=driver.findElement(By.id("draggable"));
WebElement b=driver.findElement(By.id("droppable"));
Actions act=new Actions(driver);
act.dragAndDrop(a, b).build().perform();

	}

}
