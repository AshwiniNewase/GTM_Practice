package amazon_TestFile;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import amazon_SourceFile.CheckoutPage;
import amazon_SourceFile.HomePage;
import amazon_SourceFile.LoginPage;
import amazon_SourceFile.SearchResultPage;

//Login to amazon->search a product->add it to wishlist->add it to cart->Make a paymnet using COD->logout			
public class TestCase2_login_search_cart_payment_logout extends LaunchQuit
{
	@Test
	public void loginsearchwishlistcartpaymentlogout() throws InterruptedException
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
		searchproductpage.proceedtobuy();
		CheckoutPage checkoutpage=new CheckoutPage(driver);
		//checkoutpage.changeaddress();
		checkoutpage.selectpaymentmethod(driver);
		searchproductpage.movecontroltomainwindow(driver);
		homepage.accountlist(driver);
		homepage.signout();
		loginpage.testcaseassertion(driver);
	}

}
