package selenium.wait;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
public class ImplecitWait {
	public static void main(String[] args) {
		
	
	// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","D:\\Automation Testing\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.linkedin.com/");
			System.out.println(driver.getCurrentUrl());
			
			
			
			
			 
			String id ="phungle3001@gmail.com";
			String pass="P@ssword123";
			driver.findElement(By.xpath("//*[@id='login-email']")).sendKeys(id);
			driver.findElement(By.xpath("//*[@id='login-password']")).sendKeys(pass);
			driver.findElement(By.xpath("//*[@id='login-submit']")).click();
			if (driver.findElement(By.xpath("//*[@data-control-name='identity_welcome_message']")).getText().equalsIgnoreCase("Welcome, Phung!"))
					{
				System.out.println("Login thanh cong!");
					}
					
			driver.findElement(By.xpath("//*[@data-control-name='identity_welcome_message']")).click();
			
			//Implicit wait cho den khi trang web tim thay phan tu o dong code tip theo
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			// Xpath cho nut Next - cach 1
			driver.findElement(By.xpath("//div[@class='transition-buttons']/button[2]")).click();
			
			
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			
			String Next2;
			// Xpath cho nut Next - cach 2
			Next2=driver.findElement(By.xpath("//div[@class='transition-buttons']/button[text()='Next']")).getText();
			System.out.println(Next2);
}
}