package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		WebElement email = driver.findElement(By.xpath("//table[@role='presentation']"));
		WebElement drpdown = email.findElement(By.xpath("//tbody/tr[2]/td/input"));
		drpdown.sendKeys("harsha.kov@gmail.com");
		System.out.println("From Asian End");
	}

}
