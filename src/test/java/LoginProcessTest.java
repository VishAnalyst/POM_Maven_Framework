import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginProcessTest {
    @Test
    public void loginTest(){


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        Login login = new Login(driver);
        login.setTextUsername("admin");
        login.setTextPassword("Test1234");
        login.clickSubmit();


        System.out.println("THE TEST IS PASSED");


    }
}
