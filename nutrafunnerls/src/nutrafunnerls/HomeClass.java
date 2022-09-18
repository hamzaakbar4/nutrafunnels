package nutrafunnerls;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://staging.nutrafunnels.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]"))
				.click();
		driver.findElement(By.id("user_login")).sendKeys("qatester@newrich.com");
		driver.findElement(By.id("user_pass")).sendKeys("!m%IuT)Gxd@MXVPYu*iH4sM#ch.");
		driver.findElement(By.id("wp-submit")).click();
		
		//Assert
		String actualUrl="https://staging.nutrafunnels.com/coaching-list/";
		
		String newUrl = driver.getCurrentUrl();

		if(newUrl.equalsIgnoreCase(actualUrl)){
		    System.out.println("User is Successfully Loged in");
		}
		else {
			System.out.println("Login failed");
		}

		
	

	}

}
