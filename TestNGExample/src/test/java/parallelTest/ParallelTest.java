package parallelTest;

import org.testng.annotations.Test;

public class ParallelTest extends BaseTest {

	@Test(invocationCount = 6, threadPoolSize = 3 )
	public void launch() {
		
		driver= getDriver("Chrome");
		driver.get("http://google.com");
		driver.quit();

	}

}
