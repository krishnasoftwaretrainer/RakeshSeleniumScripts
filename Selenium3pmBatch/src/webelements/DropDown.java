package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//Scroll WebPage:Vertical[Top to Bottom] and Horizontal[Left to Right]
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)"); //Vertical Scroll Down
		
		WebElement skills=driver.findElement(By.id("Skills"));
		
		Select select=new Select(skills);
		//select.selectByIndex(3);
		//select.selectByVisibleText("Certifications");
		select.selectByValue("Engineering");
		
		
		
		
		
		/*
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(500,0)"); //Horizontal Scroll Right
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-500)"); //Vertical Scroll Up
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(-500,0)"); //Horizontal Scroll Left
		*/
		
		
	}

}
