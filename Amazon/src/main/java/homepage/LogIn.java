package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn {
    @FindBy(xpath = "//a[@id='nav-logo-sprites']")
    public static WebElement logo;
    public void validateAmazonLogo(){
        logo.isDisplayed();

    }
}
