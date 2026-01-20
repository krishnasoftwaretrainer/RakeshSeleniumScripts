package swagLabs_loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwagLabs_ValidLoginPage
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		String ExceptedURL="https://www.saucedemo.com/inventory.html";
		String ActuvalURL=driver.getCurrentUrl();
	
		if(ExceptedURL.equalsIgnoreCase(ActuvalURL))
		{
			System.out.println("Test Case is Passed");
		}
		else
		{
			System.out.println("Test Case is Failed");
		}
		
		
	}

}
