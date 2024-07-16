package project;

import org.openqa.selenium.By;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TutorialNinjas {
	
WebDriver driver;
	
	@BeforeClass
	
	public void setup() throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/");
		
		Thread.sleep(5000);
		
	}
	
	@Test(priority = 1, enabled = true)
	
	public void register() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
        
		Thread.sleep(5000);
        
		
        driver.findElement(By.xpath("//a[@title='My Account']")).click();
        
        Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Khushi");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("upadhyay");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hushiii31@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("5658884409");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sushiii31@@");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("sushiii31@@");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,900)");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		

	}
	
	@Test(priority = 2, enabled = true)
	
	public void Logout() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
        Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,900)");
		
		Thread.sleep(5000);
		
        driver.findElement(By.xpath("(//a[text()='Logout'])[2]")).click();
        

		
		driver.findElement(By.xpath("(//a[text()='Login'])[2]")).click();
		
		Thread.sleep(5000);
		
		}
	
	@Test(priority= 3, enabled = true)
	
	public void Login() throws InterruptedException {
		
        driver.findElement(By.xpath("(//a[text()='Login'])[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hushiii31@gmail.com");
		
        Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sushiii31@@");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	
       @Test(priority= 4, enabled = true)
	
	   public void Homepage() throws InterruptedException {
    	
       driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();
       
       }
       
       
       @Test(priority= 5, enabled = true)
       
       public void Search() throws InterruptedException {
    	  
    	   
    	   driver.findElement(By.xpath("//input[@name='search']")).sendKeys("i phone");
    	   
    	   Thread.sleep(2000);
    	   
    	   driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
    	   
    	   Thread.sleep(2000);
    	   
    	   driver.findElement(By.xpath("//img[@title='iPhone']")).click();
    	   
    	   Thread.sleep(2000);
    	   
    	   driver.findElement(By.xpath("//button[text()='Add to Cart']"));
    	   
    	   driver.navigate().back();
    	   
    	   driver.navigate().back();
    	   
    	   }
	
	
	
	
	    @AfterClass
	    
	    public void end() {
	    	
		driver.close();
		
	}
	

}
