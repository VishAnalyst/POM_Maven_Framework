import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ContactPage {

    //Initiate the web driver
    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void setup(){
        driver.get("https://practicetestautomation.com/contact/");
        driver.manage().window().maximize();
        System.out.println("THE BROWSER IS OPENED");
    }

    //Positive scenario
    @Test
    public void contactPageTest() {
        Contact  contact = new Contact(driver);
        contact.setTextContactName("Test");
        System.out.println("Name field is accepting the values");

        contact.setTextContactLastname("LastTest");
        System.out.println("last Name field is accepting the values");

        contact.setTextContactEmail("test1123");
        System.out.println("email field is accepting the values");

        contact.setTextContactComment("jshdjsdhsjshudhfjdnffwrjijij");
        System.out.println("comment field is accepting the values");

        contact.clickSubmitContact();
        System.out.println("Button click worked");
        System.out.println("Every field is passed the values");


    }
    @AfterClass
    public void tearDown(){
        if (driver !=null){
            driver.quit();
            System.out.println("Test Passed");
        }
    }
}
