package amazon_TestFile;
//Login to amazon->search a product->add it to wishlist->remove it from wishlist->logout			

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import amazon_SourceFile.HomePage;
import amazon_SourceFile.LoginPage;
import amazon_SourceFile.SearchResultPage;
import amazon_SourceFile.WishListPage;

public class TestCase4_login_search_wishlist_removefromwishlist_logout extends LaunchQuit
{
	@Test
	public void loginsearchwishlistremovefromwishlist() throws InterruptedException
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
		//searchproductpage.continueshopping();
		//searchproductpage.addtocart();
		searchproductpage.viewwishlist();
		WishListPage wishlistpage=new WishListPage(driver);
		wishlistpage.deleteitemfromwishlist();
		homepage.accountlist(driver);
		homepage.signout();
		loginpage.testcaseassertion(driver);
		
	}
	
}
