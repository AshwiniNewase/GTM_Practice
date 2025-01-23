package AmazonProject_TestScenarios;

import org.testng.annotations.Test;

import AmazonProject_SourceFile.HomePage;
import AmazonProject_SourceFile.SignInPage;


//Verify login is successful with correct email and password.
public class TestScenario2_SuccessfulSignIn extends LaunchQuitAmazon
{
	@Test
	public void successfulsignin() throws InterruptedException
	{
		HomePage homepage=new HomePage(driver);
		homepage.accountandlists(driver);
		homepage.signin();
		SignInPage signinpage=new SignInPage(driver);
		signinpage.signinamazon();
		homepage.testscenario1assertion(driver);	
	}
}
