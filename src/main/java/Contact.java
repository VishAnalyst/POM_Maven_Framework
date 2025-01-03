import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact {

    //Contact form Elements
        @FindBy(id ="wpforms-161-field_0")
        WebElement textContactName;

        @FindBy (id ="wpforms-161-field_0-last")
        WebElement textContactLastName;

        @FindBy (id ="wpforms-161-field_1")
        WebElement textContactEmail;

        @FindBy (id ="wpforms-161-field_2")
        WebElement textContactComment;

        @FindBy (id="wpforms-submit-161")
        WebElement btmContactSubmit;

    //to Initiate the process we need driver
    public Contact (WebDriver driver){PageFactory.initElements(driver,this);}

    //Operative methods for the contact page elements
    public void setTextContactName(String firstname){
        textContactName.sendKeys(firstname);
    }
    public void setTextContactLastname(String lastname){textContactLastName.sendKeys(lastname);};
    public void setTextContactEmail(String email){textContactEmail.sendKeys(email);};
    public void setTextContactComment(String comment){textContactComment.sendKeys(comment);};
    public void clickSubmitContact() {btmContactSubmit.click();};
}
