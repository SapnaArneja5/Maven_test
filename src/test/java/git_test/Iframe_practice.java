package git_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_practice {

	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "C:/sapna/installed_program/selenium_driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
				
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Frames.html"); 
		
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		
		WebElement outerframe=driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(outerframe); //switch to outerframe
		
		
		WebElement innerframe=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerframe); 
		
		
		//textbox
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("welcome!!!!");
		Thread.sleep(3000);
	driver.close();
	}

}
