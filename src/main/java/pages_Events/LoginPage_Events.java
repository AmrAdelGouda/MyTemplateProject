package pages_Events;

import Utilities.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages_Elements.HomePage_Elements;
import pages_Elements.LoginPage_Elements;

public class LoginPage_Events extends PageBase {
    public LoginPage_Events(WebDriver driver) {
        super(driver);
    }
    HomePage_Elements HomePageObj;
    LoginPage_Elements LoginPage = new LoginPage_Elements();

    public void fillLoginForm(String Username, String Password) {
        WaitFor(LoginPage.Login_UserNameField);
        System.out.println("********** Login UserName is : " + Username);
        enterText(LoginPage.Login_UserNameField,Username);
        System.out.println("********** Login Password is : " + Password);
        enterText(LoginPage.Login_PasswordField,Password);
        clickOn(LoginPage.Login_LoginButton);
    }
    public void verifyLogin(String Username, String Password){
        HomePageObj = new HomePage_Elements();
        WaitFor(HomePageObj.WelcomArea);
        String WelcomeAreaText = getTextOf(HomePageObj.WelcomArea);
        System.out.println("_________Welcome Area Text is : " + WelcomeAreaText);
        Assert.assertTrue(WelcomeAreaText.contains(Username));
    }
}
