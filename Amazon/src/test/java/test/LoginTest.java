package test;

import base.CommonAPI;
import homepage.LogIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends CommonAPI{
    LogIn logIn;
    @BeforeMethod
    public void setLogIn(){
        logIn = PageFactory.initElements(driver,LogIn.class);
    }
    @Test
    public void logoTest(){
        logIn.validateAmazonLogo();
    }

}
