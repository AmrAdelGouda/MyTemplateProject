package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase{

    public HomePage(WebDriver driver) {
        super(driver);
    }
    By SignUpButton = By.xpath("//a[@id='signin2']");
    By LoginButton = By.xpath("//a[@id='login2']");
    By LogoutButton = By.xpath("//a[@id='logout2']");
    By WelcomArea = By.xpath("//a[@id='nameofuser']");
    By HometButton = By.xpath("//a[contains(text(),'Home')]");

    public void openSignUpForm(){
        WaitFor(SignUpButton);
        clickOn(SignUpButton);
    }

    public void openLoginForm() {
        WaitFor(LoginButton);
        clickOn(LoginButton);
    }

    public void signOut(){
        WaitFor(LogoutButton);
        clickOn(LogoutButton);
    }

    public void openHomePage() {
        WaitFor(HometButton);
        clickOn(HometButton);
    }
}
