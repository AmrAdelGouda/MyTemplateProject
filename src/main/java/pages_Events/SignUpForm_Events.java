package pages_Events;

import Utilities.PageBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages_Elements.SignUpForm_Elements;

import java.time.Duration;

public class SignUpForm_Events extends PageBase {
    WebDriver driver;
    public SignUpForm_Events(WebDriver driver) {
        super(driver) ;
        this.driver = driver;
    }

    SignUpForm_Elements SignUpForm = new SignUpForm_Elements();

    public void fillSignUpForm(String UserName , String PassWord){
        WaitFor(SignUpForm.SignUp_UserNameField);
        enterText(SignUpForm.SignUp_UserNameField ,UserName );
        WaitFor(SignUpForm.SignUp_PasswordField);
        enterText(SignUpForm.SignUp_PasswordField ,PassWord );
        clickOn(SignUpForm.SignUp_SignUpButton);
    }

    public void verifySignUp() {
        WebDriverWait waitAlert = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitAlert.until(ExpectedConditions.alertIsPresent());
        // Switch the driver context to the alert
        Alert alertDialog = driver.switchTo().alert();
        // Get the alert text
        String alertText = alertDialog.getText();
        // Click the OK button on the alert.
        Assert.assertEquals(alertText,SignUpForm.SignUpSuccessMessage);
        alertDialog.accept();
    }
}
