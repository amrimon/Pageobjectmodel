package MavenProjectsRimon.TestMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut {

	private WebDriver driver;

	public CheckOut(WebDriver driver) {
		this.driver=driver;
	}

	public void signin() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("itguru2021@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.id("passwd")).sendKeys("Kaziiscool1");
		Thread.sleep(2000);
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("processAddress")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("cgv")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("processCarrier")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("cheque")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		
		
		
		
		
	}


}
