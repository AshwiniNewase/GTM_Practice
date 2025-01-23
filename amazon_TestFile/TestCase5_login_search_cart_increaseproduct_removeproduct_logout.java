package amazon_TestFile;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import amazon_SourceFile.HomePage;
import amazon_SourceFile.LoginPage;
import amazon_SourceFile.SearchResultPage;
import amazon_SourceFile.ShoppingCartPage;

//Login to amazon->search a product->add it to cart->incrdement its count by 3->remove the product which are presnet in cart->logout			
public class TestCase5_login_search_cart_increaseproduct_removeproduct_logout extends LaunchQuit
{
	@Test
	public void loginsearchcartincreaseproductcountremoveproductlogout() throws InterruptedException
	{
		HomePage homepage=new HomePage(driver);
		homepage.accountlist(driver);
		homepage.signin();
		LoginPage loginpage=new LoginPage(driver);
		loginpage.username();
		loginpage.continuebutton();
		loginpage.password();
		loginpage.signin_loginpage();
		homepage.searchproduct();
		SearchResultPage searchproductpage=new SearchResultPage(driver);
		searchproductpage.clickonproduct(driver);
		searchproductpage.addtocart();
		searchproductpage.gotocart();
		ShoppingCartPage shoppingcartpage=new ShoppingCartPage(driver);
		shoppingcartpage.productincrementcount();
		shoppingcartpage.deleteproduct();
		homepage.accountlist(driver);
		homepage.signout();
		loginpage.testcaseassertion(driver);
		
	}
}
