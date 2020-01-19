package parallelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;

	public WebDriver getDriver(String browser) {

		if (browser.equals("Chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			return driver;

		} else if (browser.equals("ff")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

			return driver;

		}

		return null;

	}

}
