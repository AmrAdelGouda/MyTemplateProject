package pages_Events;

import Utilities.PageBase;
import org.openqa.selenium.WebDriver;
import pages_Elements.HomePage_Elements;

public class HomePage_Events extends PageBase {

    public HomePage_Events(WebDriver driver) {
        super(driver);
    }
    HomePage_Elements Home = new HomePage_Elements();

    public void openSignUpForm(){
        WaitFor(Home.SignUpButton);
        clickOn(Home.SignUpButton);
    }

    public void openLoginForm() {
        WaitFor(Home.LoginButton);
        clickOn(Home.LoginButton);
    }

    public void signOut(){
        WaitFor(Home.LogoutButton);
        clickOn(Home.LogoutButton);
    }

    public void openHomePage() {
        WaitFor(Home.HometButton);
        clickOn(Home.HometButton);
    }
}
