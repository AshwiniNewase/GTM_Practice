package AmazonProject_TestScenarios;

import org.testng.annotations.Test;

import AmazonProject_SourceFile.EditProfilePage;
import AmazonProject_SourceFile.HomePage;
import AmazonProject_SourceFile.SignInPage;

//Check if a user can successfully edit their profile information
public class TestScenario4_SuccessfullyEditProfile extends LaunchQuitAmazon
{
	@Test
	public void successfullyeditprofile() throws InterruptedException
	{
		HomePage homepage=new HomePage(driver);
		homepage.accountandlists(driver);
		homepage.signin();
		SignInPage signinpage=new SignInPage(driver);
		signinpage.signinamazon();
		homepage.manageprofile(driver);
		EditProfilePage editprofilepage=new EditProfilePage(driver);
		editprofilepage.editprofile_name();
		editprofilepage.assertiontestscenario4(driver);
	}
}
