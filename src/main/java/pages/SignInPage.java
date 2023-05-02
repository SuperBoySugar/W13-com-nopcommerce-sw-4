package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class SignInPage extends Utility {

    By welcomeText = By.xpath("//div[@class='page-title']//h1");
    By checkoutAsGuestBtn = By.xpath("//button[text()='Checkout as Guest']");
    By registerBtn = By.xpath("//button[text()='Register']");

    public void verifyWelcomeText() {
        verifyText("Welcome, Please Sign In!", welcomeText, "Welcome message is not displayed as expected");

    }
    public void clickOnCheckoutAsGuestBtn(){
        pmClickOnElement(checkoutAsGuestBtn);
    }

    public void clickOnRegisterBtn(){
        pmClickOnElement(registerBtn);
    }



}
