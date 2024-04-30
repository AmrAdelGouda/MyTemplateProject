package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
    WebDriver driver;
    public PageBase(WebDriver driver){
        this.driver = driver;
    }

    public void WaitFor(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void clickOn(By element){
        driver.findElement(element).click();
    }

    public void enterText(By element , String text){
        driver.findElement(element).sendKeys(text);
    }

    public String getTextOf(By element){
        String Text = driver.findElement(element).getText();
        return Text;
    }
}
