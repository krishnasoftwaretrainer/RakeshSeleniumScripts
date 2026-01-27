package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_IsEnabled_IsSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/registration/createAccount");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,500)");
		
		WebElement RegisterButton=driver.findElement(By.xpath("//button[text()=\"Register now\"]"));
		Thread.sleep(2000);
		//Scroll down to Specific Element[Register Button]
		js.executeScript("arguments[0].scrollIntoView(true);", RegisterButton);
		
		System.out.println("Dispalyed: "+RegisterButton.isDisplayed()); // true
		System.out.println("Enabled: "+RegisterButton.isEnabled()); // false
		Thread.sleep(2000);
		
		if(RegisterButton.isDisplayed() && RegisterButton.isEnabled())
		{
		
		RegisterButton.click();
		}
		else //false
		{
			System.out.println("Not displayed or Not enabled");
		}
		
		driver.close();
		
		
	}

}
