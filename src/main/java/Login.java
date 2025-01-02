import org.jspecify.annotations.NullMarked;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

public class Login {



    //Here in Maven we usually will have to call the driver and web elements differently
    //These are the web elements
    //Here in Main → We will maintain all the object repository

    @FindBy (id="username")
    WebElement textUsername;

    @FindBy (id="password")
    WebElement textPassword;

    @FindBy (id="submit")
    WebElement btnSubmit;


    //to Initiate the process we need driver
    public Login (WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    //These are the operative methods
    public void setTextUsername(String username){
        textUsername.sendKeys(username);
    }
    public void setTextPassword(String password) {
        textPassword.sendKeys(password);
    }
    public void clickSubmit(){
        btnSubmit.click();
    }



}
