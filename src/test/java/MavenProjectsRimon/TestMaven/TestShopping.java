package MavenProjectsRimon.TestMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




public class TestShopping {
	HomePAGE hp;
	CheckOut co;
	@BeforeClass
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    hp=new HomePAGE(driver);
	    co= new CheckOut(driver);
	    driver.manage().window().maximize();
	    driver.get("http://automationpractice.com/index.php");
	    Thread.sleep(2000);
 }
	@Test
	public void Test1() throws InterruptedException {
		hp.product();
		}
	@Test
	public void Test2() throws InterruptedException {
		hp.addtocart();
	}
	@Test
	public void Test3() throws InterruptedException {
		hp.checkout();
	}
	@Test
	public void Test4() throws InterruptedException {
		co.signin();
	}
}
