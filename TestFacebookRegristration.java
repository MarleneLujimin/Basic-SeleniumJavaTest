package seleniumjavatest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFacebookRegristration {
	
	WebDriver driver;
	
	public void invokeBrowser(){
		try {
			System.setProperty("webdriver.ie.driver","D:\\IEDriverServer.exe");
			driver =new InternetExplorerDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
			driver.get("http://www.facebook.com");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
	}
	
	public void searchcourse(){
			driver.findElement(By.xpath("//div[@id='signup-button']/a/span\r\n")).click();
			driver.findElement(By.xpath("//input[@name='firstname']\r\n")).sendKeys("caca");
			driver.findElement(By.xpath("//input[@name='lastname']\r\n")).sendKeys("john");
			driver.findElement(By.xpath("//input[@name='reg_email__']\r\n")).sendKeys("cacajohn@gmail.com");
			driver.findElement(By.xpath("//input[@name='sex']\r\n")).click();
			
			Select sel1=new Select(driver.findElement(By.xpath("//select[@id='day']\r\n")));
			sel1.selectByValue("1");
			
			Select sel2=new Select(driver.findElement(By.xpath("//select[@id='month']\r\n")));
			sel2.selectByValue("6");
			
			Select sel3=new Select(driver.findElement(By.xpath("//select[@id='year']\r\n")));
			sel3.selectByValue("1992");
			
			
			driver.findElement(By.xpath("//input[@name='reg_passwd__']\r\n")).sendKeys("caca234567");
			driver.findElement(By.xpath("//input[@id='signup_button']\r\n")).click();
			driver.navigate().back();
			driver.quit();
	
	}
	public static void main(String[] args){
			
			TestFacebookRegristration myobj = new TestFacebookRegristration();
			myobj.invokeBrowser();
			myobj.searchcourse();
			}
}
