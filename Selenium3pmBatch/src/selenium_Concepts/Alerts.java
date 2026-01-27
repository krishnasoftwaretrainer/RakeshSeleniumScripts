package selenium_Concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		
		//Alert-1
		WebElement clikbuttondisplayalert = driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]"));
		clikbuttondisplayalert.click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println("The alert message is: " + alert.getText());
		alert.accept();
		Thread.sleep(2000);
		
		//Alert-2
		WebElement AlertwithOKCancel = driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]"));
		AlertwithOKCancel.click();
		Thread.sleep(2000);
		WebElement clickthebutton = driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]"));
		clickthebutton.click();
		Thread.sleep(2000);
		alert = driver.switchTo().alert();
		System.out.println("The alert message is: " + alert.getText());
		//alert.dismiss();
		alert.accept();
		Thread.sleep(2000);
		WebElement afteralertmsg = driver.findElement(By.id("demo"));
		System.out.println("The message after alert is: " + afteralertmsg.getText());
		Thread.sleep(2000);
		
		//Alert-3
		WebElement AlertwithTextbox = driver.findElement(By.xpath("//a[@href=\"#Textbox\"]"));
		AlertwithTextbox.click();
		Thread.sleep(2000);
		WebElement clickthebutton1 = driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]"));
		clickthebutton1.click();
		Thread.sleep(2000);
		alert = driver.switchTo().alert();
		System.out.println("The alert message is: " + alert.getText());
		alert.sendKeys("Selenium Automation");
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		WebElement afteralertmsg1 = driver.findElement(By.id("demo1"));
		System.out.println("The message after alert is: " + afteralertmsg1.getText());
		Thread.sleep(2000);
			
		driver.quit();
		
	}

}
