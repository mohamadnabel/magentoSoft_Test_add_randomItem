package magntosoft;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class randomAddItem {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void myBeforeTest() {

		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
	}

	@Test
//		WebElement backButton = driver.findElement(By.linkText("Home"));
	// Java code
	public void myTestRandom() throws InterruptedException {
		WebElement myList = driver.findElement(By.xpath("//ol[@class='product-items widget-product-grid']"));
		List<WebElement> itemInList = myList.findElements(By.tagName("li"));
		Random rand = new Random();
		int randomIndex = rand.nextInt(itemInList.size());
		List<WebElement> newItems = driver.findElements(By.xpath("//ol[@class='product-items widget-product-grid']")); // get the
																											// new items
		for (int i = 0; i < newItems.size(); i++) { // loop through the new items
			Thread.sleep(6000);
			itemInList.get(randomIndex).click();

			Thread.sleep(3000);
			driver.findElement(By.partialLinkText("Home")).click();

			itemInList.add(newItems.get(i)); // add the new item to the list
		}
	}

//			itemInList.get(i).click();
//			driver.navigate().back();
	;
}
