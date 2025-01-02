import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Test → we will maintain all the tests.
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
    public void loginTest() throws IOException {

        Login login = new Login(driver);
        login.setTextUsername("admin");
        login.setTextPassword("Test1234");
        login.clickSubmit();

        WebElement invalidStatement = driver.findElement(By.xpath("//div[@id='error']"));
        if (invalidStatement.isDisplayed()){
            System.out.println("Login credentials Invalid");
        }else {
            System.out.println("Login credentials valid and its working");
            System.out.println("LOGIN FAILED");
        }

            //Take Screenshot
            TakesScreenshot objScr = (TakesScreenshot) driver;
            File scrFile = objScr.getScreenshotAs(OutputType.FILE);
            String timeStamp = new SimpleDateFormat("ddMMyyyy_hhmmss").format(new Date());
            String fileType = "IMG"+timeStamp+".png";
            FileUtils.copyFile(scrFile, new File("/Users/preethianil/Downloads/Selenium/ScreenShots/"+fileType));
            System.out.println("The screenshot is taken and the file name is: "+fileType);

    }

    @Test
    public void loginTest1() throws IOException {

        Login login = new Login(driver);
        login.setTextUsername("Wrong1");
        login.setTextPassword("Wrong2");
        login.clickSubmit();

        WebElement invalidStatement2 = driver.findElement(By.xpath("//div[@id='error']"));
        if (invalidStatement2.isDisplayed()) {
            System.out.println("Login credentials Invalid");
        } else {
            System.out.println("Login credentials valid and its working");
            System.out.println("LOGIN FAILED");
        }

        //Take Screenshot
        TakesScreenshot objScr = (TakesScreenshot) driver;
        File scrFile = objScr.getScreenshotAs(OutputType.FILE);
        String timeStamp = new SimpleDateFormat("ddMMyyyy_hhmmss").format(new Date());
        String fileType = "IMG"+timeStamp+".png";
        FileUtils.copyFile(scrFile, new File("/Users/preethianil/Downloads/Selenium/ScreenShots/"+fileType));
        System.out.println("The screenshot is taken and the file name is: "+fileType);
    }

    @Test
    public void loginTest3() throws IOException {

            Login login = new Login(driver);
            login.setTextUsername("Wrong1");
            login.setTextPassword("Wrong2");
            login.clickSubmit();

            WebElement invalidStatement3 = driver.findElement(By.xpath("//div[@id='error']"));
            if (invalidStatement3.isDisplayed()) {
                System.out.println("Login credentials Invalid");
            } else {
                System.out.println("Login credentials valid and its working");
                System.out.println("LOGIN FAILED");
            }

        //Take Screenshot
        TakesScreenshot objScr = (TakesScreenshot) driver;
        File scrFile = objScr.getScreenshotAs(OutputType.FILE);
        String timeStamp = new SimpleDateFormat("ddMMyyyy_hhmmss").format(new Date());
        String fileType = "IMG"+timeStamp+".png";
        FileUtils.copyFile(scrFile, new File("/Users/preethianil/Downloads/Selenium/ScreenShots/"+fileType));
        System.out.println("The screenshot is taken and the file name is: "+fileType);
    }

    @Test
    public void loginTest4() throws IOException {

        Login login = new Login(driver);
        login.setTextUsername("Wrong1");
        login.setTextPassword("Wrong2");
        login.clickSubmit();

        WebElement invalidStatement4 = driver.findElement(By.xpath("//div[@id='error']"));
        if (invalidStatement4.isDisplayed()) {
            System.out.println("Login credentials Invalid");
        } else {
            System.out.println("Login credentials valid and its working");
            System.out.println("LOGIN FAILED");
        }

        //Take Screenshot
        TakesScreenshot objScr = (TakesScreenshot) driver;
        File scrFile = objScr.getScreenshotAs(OutputType.FILE);
        String timeStamp = new SimpleDateFormat("ddMMyyyy_hhmmss").format(new Date());
        String fileType = "IMG"+timeStamp+".png";
        FileUtils.copyFile(scrFile, new File("/Users/preethianil/Downloads/Selenium/ScreenShots/"+fileType));
        System.out.println("The screenshot is taken and the file name is: "+fileType);
    }

    @Test
    public void loginTest5() throws IOException {

        Login login = new Login(driver);
        login.setTextUsername("student");
        login.setTextPassword("Password123");
        login.clickSubmit();

        WebElement invalidStatement5 = driver.findElement(By.xpath("//div[@id='error']"));
        if (invalidStatement5.isDisplayed()) {
            System.out.println("Login credentials Invalid");
        } else {
            System.out.println("Login credentials valid and its working");
            System.out.println("LOGIN DONE");
            System.out.println("TEST PASSED");
        }

        //Take Screenshot
        TakesScreenshot objScr = (TakesScreenshot) driver;
        File scrFile = objScr.getScreenshotAs(OutputType.FILE);
        String timeStamp = new SimpleDateFormat("ddMMyyyy_hhmmss").format(new Date());
        String fileType = "IMG"+timeStamp+".png";
        FileUtils.copyFile(scrFile, new File("/Users/preethianil/Downloads/Selenium/ScreenShots/"+fileType));
        System.out.println("The screenshot is taken and the file name is: "+fileType);
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Driver closed.");
        }
    }

}
