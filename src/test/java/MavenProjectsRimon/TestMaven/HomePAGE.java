package MavenProjectsRimon.TestMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePAGE {

	private WebDriver driver;

	public HomePAGE(WebDriver driver) {
		this.driver=driver;
		
	}

	public void product() throws InterruptedException {
		 driver.findElement(By.className("sf-with-ul")).click();
	        Thread.sleep(2000);
	        JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,1000)");
	        driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[3]")).click();
	        Thread.sleep(2000);
	   //when is iframe i have to create xpath for iframe than i have to find element for product.
	        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']")));
	        Thread.sleep(2000);
	        driver.findElement(By.id("quantity_wanted")).clear();
	        Thread.sleep(2000);
	        driver.findElement(By.id("quantity_wanted")).sendKeys("4");
	        Thread.sleep(2000);
	       // driver.findElement(By.id("add_to_cart")).click();
	        //Thread.sleep(2000);
	        //AFTER im done on i frame i have to switch to @deaultcontent
	        //driver.switchTo().defaultContent();

	        
	}

	public void addtocart() throws InterruptedException {
	     driver.findElement(By.id("add_to_cart")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
		 Thread.sleep(2000);
		 driver.switchTo().defaultContent();
		
	}

	public void checkout() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		 Thread.sleep(2000);
	}

}
