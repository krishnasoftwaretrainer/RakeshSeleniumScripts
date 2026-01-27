package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_iFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		
		//Switch to Frame1
		driver.switchTo().frame("singleframe");
		Thread.sleep(2000);	
		
		//Frame1 Textbox
		WebElement Frame1Textbox1=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		Frame1Textbox1.sendKeys("Frame1 Textbox");
		
		//Default Content
		driver.switchTo().defaultContent();
		
		//Frame-2
		//Click on Iframe with in a Frame button
		WebElement IframewithinaFramebutton=driver.findElement(By.xpath("//a[@href=\"#Multiple\"]"));
		IframewithinaFramebutton.click();
		Thread.sleep(2000);
		//Switch to Frame2
	WebElement OuterFrame=driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
	driver.switchTo().frame(OuterFrame);
	Thread.sleep(2000);
	//Switch to Inner Frame
	WebElement InnerFrame=driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));
		driver.switchTo().frame(InnerFrame);
		Thread.sleep(2000);
		//Frame2 Textbox
		WebElement Frame2Textbox1=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		Frame2Textbox1.sendKeys("Frame2 Textbox");
		
	}

}
