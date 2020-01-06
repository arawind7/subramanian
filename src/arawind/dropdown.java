package arawind;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://adactin.com/HotelApp/index.php");
driver.findElement(By.id("username")).sendKeys("wikkeyss");
driver.findElement(By.id("password")).sendKeys("hanumantha");
driver.findElement(By.id("login")).click();
WebElement a=driver.findElement(By.id("location"));
Select sel=new Select(a);
sel.selectByIndex(1);
WebElement e=driver.findElement(By.id("hotels"));
Select se=new Select(e);
se.selectByIndex(1);
WebElement f=driver.findElement(By.id("room_type"));
Select s=new Select(f);
s.selectByIndex(0);
WebElement g=driver.findElement(By.id("room_nos"));
Select h=new Select(g);
h.selectByIndex(4);
driver.findElement(By.id("datepick_in")).sendKeys("01/01/2020");
driver.findElement(By.id("datepick_out")).sendKeys("03/01/2020");
WebElement l=driver.findElement(By.id("adult_room"));
Select k=new Select(l);
k.selectByIndex(3);
WebElement o=driver.findElement(By.id("child_room"));
Select m=new Select(o);
m.selectByIndex(2);
driver.findElement(By.id("Submit")).click();
driver.findElement(By.id("radiobutton_1")).click();
driver.findElement(By.id("continue")).click();
driver.findElement(By.id("first_name")).sendKeys("arawind");
driver.findElement(By.id("last_name")).sendKeys("subramanian");
driver.findElement(By.id("address")).sendKeys("5a,chennai,tambaram,600073");
driver.findElement(By.id("cc_num")).sendKeys("1615141312111009");
WebElement z=driver.findElement(By.id("cc_type"));
Select q=new Select(z);
q.selectByIndex(1);
WebElement p=driver.findElement(By.id("cc_exp_month"));
Select rr=new Select(p);
rr.selectByIndex(6);

WebElement r=driver.findElement(By.id("cc_exp_year"));
Select qq=new Select(r);
qq.selectByIndex(7);
driver.findElement(By.id("cc_cvv")).sendKeys("222");
driver.findElement(By.id("book_now")).click();
WebDriverWait wait=new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.presenceOfElementLocated(By.id("order_no")));
WebElement y=driver.findElement(By.id("order_no"));
String value=y.getAttribute("value");
System.out.println(value);


	}

}
