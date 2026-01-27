package selenium_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowsAndNewTabs {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		
		driver1.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		
		WebDriver driver2 = new ChromeDriver();
		driver2.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		WebDriver driver3 = new ChromeDriver();
		driver3.navigate().to("https://www.snapdeal.com/");
		Thread.sleep(2000);
		*/
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		
		String window1Tab1=driver.getWindowHandle();
		System.out.println("Window1 Tab1 ID: " + window1Tab1);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		String window1Tab2=driver.getWindowHandle();
		System.out.println("Window1 Tab2 ID: " + window1Tab2);
		
		driver.switchTo().newWindow(WindowType.TAB);
		String window1Tab3=driver.getWindowHandle();
		System.out.println("Window1 Tab3 ID: " + window1Tab3);
		driver.navigate().to("https://www.snapdeal.com/");
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		String window2Tab1=driver.getWindowHandle();
		System.out.println("Window2 Tab1 ID: " + window2Tab1);
		driver.navigate().to("https://www.myntra.com/");
		Thread.sleep(3000);		
		driver.close();
		//driver.quit();
	}

}
