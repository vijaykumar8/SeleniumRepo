package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.RediffHomePage;
import objectRepository.RediffLoginPage;

public class LoginApplication {
	
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "D:\\Se Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginPage rd = new RediffLoginPage(driver);
		
		rd.email().sendKeys("hello");
		rd.password().sendKeys("password");
		//rd.submit().click();
		
		RediffHomePage rd1 = new RediffHomePage(driver);
		rd1.home().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		rd1.search().click();
		
	}

}
