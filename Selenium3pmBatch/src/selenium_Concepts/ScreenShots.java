package selenium_Concepts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class ScreenShots {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		// Screen Shot-1
		File sc1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc1, new File("D:\\QT\\QT_Selenium_225,226,227\\ScreenShots\\Amazon1.png"));

		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		// Screen Shot-2
		File sc2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc2, new File("D:\\QT\\QT_Selenium_225,226,227\\ScreenShots\\FlipCart1.png"));

		driver.navigate().to("https://www.snapdeal.com/");
		Thread.sleep(2000);
		// Screen Shot-3
		File sc3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc3, new File("D:\\QT\\QT_Selenium_225,226,227\\ScreenShots\\Snapdeel1.png"));

		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.close();
		System.out.println("Test Completed Successfully");
		

	}

}
