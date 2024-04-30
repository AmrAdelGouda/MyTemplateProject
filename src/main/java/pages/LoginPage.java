package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    HomePage HomePageObj;
    By Login_UserNameField = By.xpath("//input[@id='loginusername']");
    By Login_PasswordField = By.xpath("//input[@id='loginpassword']");
    By Login_LoginButton = By.xpath("//button[@onclick='logIn()']");


    public void fillLoginForm(String Username, String Password) {
        WaitFor(Login_UserNameField);
        System.out.println("********** Login UserName is : " + Username);
        enterText(Login_UserNameField,Username);
        System.out.println("********** Login Password is : " + Password);
        enterText(Login_PasswordField,Password);
        clickOn(Login_LoginButton);
    }
    public void verifyLogin(String Username, String Password){
        HomePageObj = new HomePage(driver);
        WaitFor(HomePageObj.WelcomArea);
        String WelcomeAreaText = driver.findElement(HomePageObj.WelcomArea).getText();
        System.out.println("_________Welcome Area Text is : " + WelcomeAreaText);
        Assert.assertTrue(WelcomeAreaText.contains(Username));
    }
}
