package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SignUpForm extends PageBase{
    public SignUpForm(WebDriver driver) {
        super(driver);
    }

    By SignUp_UserNameField = By.xpath("//input[@id='sign-username']");
    By SignUp_PasswordField = By.xpath("//input[@id='sign-password']");
    By SignUp_SignUpButton = By.xpath("//button[@onclick='register()']");
    String SignUpSuccessMessage = "Sign up successful.";


    public void fillSignUpForm(String UserName , String PassWord){
        WaitFor(SignUp_UserNameField);
        enterText(SignUp_UserNameField ,UserName );
        WaitFor(SignUp_PasswordField);
        enterText(SignUp_PasswordField ,PassWord );
        clickOn(SignUp_SignUpButton);
    }

    public void verifySignUp() {
        WebDriverWait waitAlert = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitAlert.until(ExpectedConditions.alertIsPresent());
        // Switch the driver context to the alert
        Alert alertDialog = driver.switchTo().alert();
        // Get the alert text
        String alertText = alertDialog.getText();
        // Click the OK button on the alert.
        Assert.assertEquals(alertText,SignUpSuccessMessage);
        alertDialog.accept();
    }
}
