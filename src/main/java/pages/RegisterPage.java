package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class RegisterPage extends Utility {

    By registerText = By.xpath("//h1[text()='Register']");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By email = By.id("Email");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By register = By.id("register-button");
    By registerMessage = By.xpath("//div[@class='result']");
    By continueBtn = By.xpath("//a[contains(text(),'Continue')]");

    public void verifyTextRegister(){
        verifyText("Register", registerText,"Page is not displayed");
    }
    public void inputFirstNameField(String name){
        sendTextToElement(firstName,name);
    }

    public void lastNameField(String lName){
        sendTextToElement(lastName,lName);
    }
    public void emailField(String email1){
        sendTextToElement(email, email1);
    }
    public void passwordField(String password1){
        sendTextToElement(password,password1);
    }
    public void confirmPasswordField(String confirmPass){
        sendTextToElement(confirmPassword,confirmPass);
    }
    public void clickOnRegister(){
        pmClickOnElement(register);
    }
    public void verifyRegisterTextMessage(){
        verifyText("Your registration completed",registerMessage,"Message is not displayed");
    }
    public void clickOnContinueBtn(){
        pmClickOnElement(continueBtn);
    }
}
