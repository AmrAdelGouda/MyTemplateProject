package pages_Elements;

import org.openqa.selenium.By;

public class SignUpForm_Elements {
    public By SignUp_UserNameField = By.xpath("//input[@id='sign-username']");
    public By SignUp_PasswordField = By.xpath("//input[@id='sign-password']");
    public By SignUp_SignUpButton = By.xpath("//button[@onclick='register()']");
    public String SignUpSuccessMessage = "Sign up successful.";
}
