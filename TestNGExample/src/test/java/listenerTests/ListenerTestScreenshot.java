package listenerTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.TestBase;

public class ListenerTestScreenshot extends TestBase {

	@Test
	public void login() {

		
		driver.findElement(By.id("identifierId")).sendKeys("bahadundar85@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
	}
	
	@Test
	public void composeEmail() {
		
		
		Assert.fail();
	}

}
