package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF2 {
	
	WebDriver driver;
	
	public RediffLoginPagePF2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = ".//*[@id='login1']")
	WebElement username;
	
	@FindBy(xpath = ".//*[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "html/body/div[1]/div[1]/div[2]/a")
	WebElement home;
	
	public WebElement email() {
		return username;
	}
	
	public WebElement password() {
		return password;
	}
	
	public WebElement home() {
		return home;
	}

}
