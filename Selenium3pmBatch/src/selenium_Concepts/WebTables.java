package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		
		//Click on Add button
	WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
	addButton.click();
	Thread.sleep(1000);
	//Fill the form
	driver.findElement(By.id("firstName")).sendKeys("John");
	driver.findElement(By.id("lastName")).sendKeys("Doe");
	driver.findElement(By.id("userEmail")).sendKeys("john.d@gamil.com");
	driver.findElement(By.id("age")).sendKeys("30");
	driver.findElement(By.id("salary")).sendKeys("50000");
	driver.findElement(By.id("department")).sendKeys("Engineering");
	//Submit the form
	Thread.sleep(1000);
	driver.findElement(By.id("submit")).click();
	Thread.sleep(2000);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,300)");
	
	//Verify/Search the new entry
	WebElement searchBox = driver.findElement(By.id("searchBox"));
	searchBox.sendKeys("John");
	Thread.sleep(2000);
	
	//Click on Edit button
	WebElement editButton = driver.findElement(By.id("edit-record-4"));
	editButton.click();
	Thread.sleep(1000);
	
	//Update the details
	WebElement LastNameField = driver.findElement(By.id("lastName"));
	LastNameField.clear();
	LastNameField.sendKeys("Smith");
	//WebElement ageField = driver.findElement(By.id("age"));
	//ageField.clear();
	//ageField.sendKeys("35");
	
	//Submit the form
	Thread.sleep(1000);
	driver.findElement(By.id("submit")).click();
	Thread.sleep(1000);
	
		//Delete the entry
	WebElement deleteButton = driver.findElement(By.id("delete-record-4"));
	deleteButton.click();
	Thread.sleep(1000);
	//Refresh the search
		driver.navigate().refresh();
		
	Thread.sleep(2000);
	driver.quit();
	}

}
