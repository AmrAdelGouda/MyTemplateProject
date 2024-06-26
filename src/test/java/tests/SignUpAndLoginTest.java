package tests;

import baseTest.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages_Events.HomePage_Events;
import pages_Events.LoginPage_Events;
import pages_Events.SignUpForm_Events;

public class SignUpAndLoginTest extends TestBase {
    HomePage_Events HomePageObj;
    SignUpForm_Events SignUpFormObj;
    LoginPage_Events LoginPageObj;


    @BeforeMethod
    public void initialization() {
        HomePageObj = new HomePage_Events(driver);
        SignUpFormObj = new SignUpForm_Events(driver);
        LoginPageObj = new LoginPage_Events(driver);
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
