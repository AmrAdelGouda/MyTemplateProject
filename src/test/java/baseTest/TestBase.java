package baseTest;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    Faker faker = new Faker();
    protected String Username = faker.name().username();
    protected String Password = faker.internet().password();

    @BeforeSuite
    public void startDriver() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to("https://www.demoblaze.com");
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
