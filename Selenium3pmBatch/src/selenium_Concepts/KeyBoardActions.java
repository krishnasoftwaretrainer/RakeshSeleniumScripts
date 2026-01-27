package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://omayo.blogspot.com/");
		
		Actions act = new Actions(driver);
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,500)");
		
		WebElement textArea1=driver.findElement(By.id("ta1"));
		WebElement textArea2=driver.findElement(By.xpath("//*[@id=\"HTML11\"]/div[1]/textarea"));
		act.moveToElement(textArea1).perform();
		//textArea1.sendKeys("Welcome to Selenium Automation");
		//textArea1.sendKeys("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		
		act.keyDown(Keys.SHIFT).sendKeys(textArea1, "sfhdfhdfhdghyueterwq").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(2000);
		//act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform(); // Select All
		//act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform(); // Copy
		act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("x").keyUp(Keys.CONTROL).build().perform(); // Select All + Copy + Paste
		Thread.sleep(2000);
		//textArea2.clear();
		Thread.sleep(2000);
		//act.sendKeys(Keys.TAB).build().perform(); // Move Focus to Next Element
		act.keyDown(Keys.CONTROL).sendKeys(textArea2, "a").keyUp(Keys.CONTROL).build().perform(); // Select All
		//act.sendKeys(Keys.BACK_SPACE).build().perform(); // Delete
		act.sendKeys(Keys.DELETE).build().perform(); // Delete
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform(); // Paste
		
	}

}
