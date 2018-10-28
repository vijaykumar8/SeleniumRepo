package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	
	WebDriver driver;
	
	public RediffHomePage(WebDriver driver) {
		this.driver = driver;
		System.out.println("testing");
	}
	
	By home = By.linkText("Home");
	By search = By.xpath(".//*[@id='srch_show_hide_btn']/div[1]/img");
	
	
	
	public WebElement search() {
		return driver.findElement(search);
	}

	public WebElement home() {
		// TODO Auto-generated method stub
		return driver.findElement(home);
	}

}
