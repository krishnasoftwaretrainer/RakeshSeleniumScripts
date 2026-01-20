package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebLocaters {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.tagName("input")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]")).sendKeys("World");
	
		
		driver.findElement(By.name("radiooptions")).click();
		
		driver.findElement(By.id("checkbox1")).click();
		Thread.sleep(2000);
		
		if( driver.findElement(By.id("checkbox1")).isSelected() )
		{
			System.out.println("Checkbox1 is already selected");
		}
		else
		{
			driver.findElement(By.id("checkbox1")).click();
			Thread.sleep(2000);
	}
		
	//	driver.findElement(By.id("checkbox1")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.id("checkbox1")).click();
		//driver.findElement(By.id("checkbox2")).click();
		//driver.findElement(By.id("checkbox3")).click();
		
		
		
		//WebElement check3=driver.findElement(By.id("checkbox3"));
		//check3.click();
		//int i=0;
		//int a=10;
		/*
		List<WebElement> Hobbies=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));		
		for(int i=0;i<Hobbies.size();i++)//0<3 1<3 2<3 3<3 Stop 
		{
			Hobbies.get(i).click();
			Thread.sleep(2000);
		}
		*/
	
	}

}
