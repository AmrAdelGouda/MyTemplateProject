package pages_Elements;

import org.openqa.selenium.By;

public class LoginPage_Elements {
    public By Login_UserNameField = By.xpath("//input[@id='loginusername']");
    public By Login_PasswordField = By.xpath("//input[@id='loginpassword']");
    public By Login_LoginButton = By.xpath("//button[@onclick='logIn()']");
}
