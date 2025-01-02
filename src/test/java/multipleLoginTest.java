import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class MultipleLoginTest {

    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void setup() {
        // Initialize WebDriver once before all tests
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        System.out.println("Driver initialized.");
    }

    @Test
    public void loginTest() {

        Login login = new Login(driver);
        login.setTextUsername("admin");
        login.setTextPassword("Test1234");
        login.clickSubmit();

        WebElement invalidStatement = driver.findElement(By.xpath("//div[@id='error']"));
        if (invalidStatement.isDisplayed()){
            System.out.println("Login credentials Invalid");
        }else {
            System.out.println("Login credentials valid and its working");
        }
    }

    @Test
    public void loginTest1() {

        Login login = new Login(driver);
        login.setTextUsername("Wrong1");
        login.setTextPassword("Wrong2");
        login.clickSubmit();

        WebElement invalidStatement2 = driver.findElement(By.xpath("//div[@id='error']"));
        if (invalidStatement2.isDisplayed()) {
            System.out.println("Login credentials Invalid");
        } else {
            System.out.println("Login credentials valid and its working");
        }
    }

    @Test
    public void loginTest3(){

            Login login = new Login(driver);
            login.setTextUsername("Wrong1");
            login.setTextPassword("Wrong2");
            login.clickSubmit();

            WebElement invalidStatement3 = driver.findElement(By.xpath("//div[@id='error']"));
            if (invalidStatement3.isDisplayed()) {
                System.out.println("Login credentials Invalid");
            } else {
                System.out.println("Login credentials valid and its working");
            }
    }

    @Test
    public void loginTest4(){

        Login login = new Login(driver);
        login.setTextUsername("Wrong1");
        login.setTextPassword("Wrong2");
        login.clickSubmit();

        WebElement invalidStatement4 = driver.findElement(By.xpath("//div[@id='error']"));
        if (invalidStatement4.isDisplayed()) {
            System.out.println("Login credentials Invalid");
        } else {
            System.out.println("Login credentials valid and its working");
            System.out.println("TEST PASSED");
        }
    }

    @Test
    public void loginTest5(){

        Login login = new Login(driver);
        login.setTextUsername("student");
        login.setTextPassword("Password123");
        login.clickSubmit();

        WebElement invalidStatement5 = driver.findElement(By.xpath("//div[@id='error']"));
        if (invalidStatement5.isDisplayed()) {
            System.out.println("Login credentials Invalid");
        } else {
            System.out.println("Login credentials valid and its working");
            System.out.println("TEST PASSED");
        }
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Driver closed.");
        }
    }

}
