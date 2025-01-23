package january16_Parallel;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchProduct_Amazon extends Amazon_loginlogout_Parallel
{

	@Test
	public void addtocart_product()
	{
		WebElement search_Textbox=driver.findElement(By.id("twotabsearchtextbox"));
		search_Textbox.sendKeys("books"+Keys.ENTER);
	}
}
