package amazon_TestFile;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import amazon_SourceFile.HomePage;
import amazon_SourceFile.LoginPage;
import amazon_SourceFile.SearchResultPage;
import amazon_SourceFile.WishListPage;

//Login to amazon->search a product->add it to wishlist->add it to cart->logout
public class TestCase1_login_search_cart_logout extends LaunchQuit
{
	@Test
	public void loginsearchcartlogout() throws InterruptedException
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
		searchproductpage.wishlistbutton();
		searchproductpage.continueshopping();
		searchproductpage.addtocart();
		searchproductpage.gotocart();
		homepage.accountlist(driver);
		homepage.signout();
		loginpage.testcaseassertion(driver);
	}
}

