package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demoqa.com/buttons");
		//driver.navigate().to("https://demoqa.com/dragabble");
		//driver.get("https://demoqa.com/droppable");
		driver.get("https://www.browserstack.com/");
		Actions act = new Actions(driver);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,300)", "");
		/*
		WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(doubleClickBtn).perform();
		//doubleClickBtn.click();
		Thread.sleep(2000);
		WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rightClickBtn).perform();
		
		//act.contextClick().perform();
		*/
		/*
		WebElement dragMe = driver.findElement(By.id("dragBox"));
		act.clickAndHold(dragMe).perform();
		Thread.sleep(1000);
		act.moveByOffset(0, 100).perform();
		Thread.sleep(1000);
		act.moveByOffset(0, -100).perform();
		Thread.sleep(1000);
		act.moveByOffset(100, 0).perform();
		Thread.sleep(1000);
		act.moveByOffset(-100, 0).perform();
		Thread.sleep(1000);
		act.release().perform();
		*/
		/*
		//Scroll to specific element
		WebElement dragMe = driver.findElement(By.id("draggable"));
		//act.moveToElement(dragMe).perform();
		act.moveToElement(dragMe).clickAndHold().perform();
		WebElement dropHere = driver.findElement(By.id("droppable"));
		//js.executeScript("arguments[0].scrollIntoView(true);", dragMe);
		Thread.sleep(1000);
		act.dragAndDrop(dragMe, dropHere).perform();
		*/
		
		WebElement resourcesMenu = driver.findElement(By.id("products-dd-toggle"));
		act.moveToElement(resourcesMenu).perform();
		Thread.sleep(1000);
		WebElement webTestingMenu = driver.findElement(By.id("products-dd-tab-2"));
		act.moveToElement(webTestingMenu).click().perform();
		Thread.sleep(1000);
		WebElement Live=driver.findElement(By.xpath("//a[@href=\"/live\"]"));
		Live.click();
		
		//String excepetdURL="https://www.browserstack.com/live";
		//String actualURL=driver.getCurrentUrl();
		String excepetdTitle="Cross browser testing on desktop & mobile | BrowserStack";
		String actuvalTitle=driver.getTitle();
		
		System.out.println("Expected Title: "+excepetdTitle);		
		System.out.println("Actual Title: "+actuvalTitle);
		//if(excepetdURL.equals(actualURL)) {
		
		if(excepetdTitle.equals(actuvalTitle)) {
			System.out.println("Live Page is Displayed - Test Case is Passed");
		}
		else {
			System.out.println("Live Page is not Displayed - Test Case is Failed");
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
