package AmazonProject_TestScenarios;
//Ensure login fails with incorrect email or password.

import org.testng.annotations.Test;

import AmazonProject_SourceFile.HomePage;
import AmazonProject_SourceFile.SignInPage;

public class TestScenario3_SignInFailWrongCredentials extends LaunchQuitAmazon
{
	@Test
	public void signinfail_wrongcredentials() throws InterruptedException
	{
		HomePage homepage=new HomePage(driver);
		homepage.accountandlists(driver);
		homepage.signin();
		SignInPage signinpage=new SignInPage(driver);
		signinpage.signinamazon();
		homepage.testscenario2assertion(driver);
		
	}
	
}
