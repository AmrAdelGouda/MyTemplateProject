package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpForm;

public class SignUpAndLoginTest extends TestBase {
    HomePage HomePageObj;
    SignUpForm SignUpFormObj;
    LoginPage LoginPageObj;


    @BeforeMethod
    public void initialization() {
        HomePageObj = new HomePage(driver);
        SignUpFormObj = new SignUpForm(driver);
        LoginPageObj = new LoginPage(driver);
    }

    @Test(priority = 1)
    public void verifySignUp() {
        HomePageObj.openSignUpForm();
        SignUpFormObj.fillSignUpForm(Username, Password);
        SignUpFormObj.verifySignUp();
    }

    @Test(priority = 2)
    public void verifyLoginProcess() {
        HomePageObj.openLoginForm();
        LoginPageObj.fillLoginForm(Username, Password);
        LoginPageObj.verifyLogin(Username, Password);
    }

}
