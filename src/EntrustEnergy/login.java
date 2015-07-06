package EntrustEnergy;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class login extends EntrustEnergy.OpenBrowser  {
	
	@Test
	public static void logIn() throws Exception{
	
		driver.findElement(By.xpath(".//*[@id='login-email']")).sendKeys("softway_admin");
		driver.findElement(By.xpath(".//*[@id='login-password']")).sendKeys("softway.123456");
		driver.findElement(By.xpath(".//*[@id='form-login']/div[4]/div/button")).click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, "AIM Administrator :: Control Center");
		System.out.println("This is the comit line");
		
		
	
		
	}

}
