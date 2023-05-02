package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class CheckoutPage extends Utility {
    By firstName = By.id("BillingNewAddress_FirstName");
    By lastName = By.id("BillingNewAddress_LastName");
    By email = By.id("BillingNewAddress_Email");
    By country = By.id("BillingNewAddress_CountryId");
    By city = By.id("BillingNewAddress_City");
    By address = By.id("BillingNewAddress_Address1");
    By zipCode = By.id("BillingNewAddress_ZipPostalCode");
    By telephoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By continueBtn = By.xpath("//button[@onclick='Billing.save()']");
    By nextDayAirRadioBtn = By.id("shippingoption_1");
    By shippingContinueBtn = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By creditCardOption = By.id("paymentmethod_1");
    By paymentContinue = By.xpath("//button[@name='save' and @class='button-1 payment-method-next-step-button']");
    By creditCard = By.id("CreditCardType");
    By cardHolderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expireMonth = By.id("ExpireMonth");
    By expireYear = By.id("ExpireYear");
    By cardCode = By.id("CardCode");
    By continueOnCardPayment = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By paymentMethod = By.xpath("//li[@class='payment-method']//span[@class='value']");
    By shippingMethod = By.xpath("//li[@class='shipping-method']//span[@class='value']");
    By total = By.xpath("//span[@class='value-summary']//strong");
    By confirm = By.xpath("//button[contains(text(),'Confirm')]");
    By thankYou = By.xpath("//h1[contains(text(),'Thank you')]");
    By orderMessage = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueClick = By.xpath("//button[contains(text(),'Continue')]");
    // By welcomeToStore = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By radioBtn2ndDayAir = By.id("shippingoption_2");
    By visaCard = By.xpath("//button[@name='save' and @class='button-1 payment-method-next-step-button']");



    public void inputFirstName(String fName) {
        sendTextToElement(firstName, fName);
    }

    public void inputLastName(String lName) {
        sendTextToElement(lastName, lName);
    }

    public void inputEmail(String email1) {
        sendTextToElement(email, email1);
    }

    public void selectCountry(String country1) {
        pmSelectByVisibleTextFromDropDown(country, country1);
    }

    public void inputCity(String city1) {
        sendTextToElement(city, city1);
    }

    public void inputAddress(String address1) {
        sendTextToElement(address, address1);
    }

    public void inputZipCode(String zipCode1) {
        sendTextToElement(zipCode, zipCode1);
    }

    public void inputTelephoneNumber(String telNumber) {
        sendTextToElement(telephoneNumber, telNumber);
    }

    public void clickOnContinueBtn() {
        pmClickOnElement(continueBtn);
    }

    public void clickOnNextDayAirRadioBtn() {
        pmClickOnElement(nextDayAirRadioBtn);
    }

    public void clickOnContinueOnShipping() {
        pmClickOnElement(shippingContinueBtn);
    }

    public void clickOnCreditCard() {
        pmClickOnElement(creditCardOption);
    }

    public void clickOnPaymentContinue() {
        pmClickOnElement(paymentContinue);
    }

    public void selectCreditCard(String creditCard1) throws InterruptedException {
        Thread.sleep(1000);
        pmSelectByVisibleTextFromDropDown(creditCard, creditCard1);
    }

    public void inputCardHolderName(String cName) {
        sendTextToElement(cardHolderName, cName);
    }

    public void inputCardNumber(String cardNum) {
        sendTextToElement(cardNumber, cardNum);
    }

    public void selectExpireMonth(String expMonth) {
        pmSelectByVisibleTextFromDropDown(expireMonth, expMonth);
    }

    public void selectExpireYear(String expYear) {
        pmSelectByVisibleTextFromDropDown(expireYear, expYear);
    }

    public void inputCardCode(String code) {
        sendTextToElement(cardCode, code);
    }

    public void clickOnContinuCardPayment() {
        pmClickOnElement(continueOnCardPayment);
    }

    public void verifyPaymentMethod() {
        verifyText("Credit Card", paymentMethod, "Credit card is not displayed");
    }

    public void verifyShippingMethod() {
        verifyText("Next Day Air", shippingMethod, "Message is not display");
    }

    public void verifyTotal() {
        verifyText("$2,950.00", total, "Total is not display correctly");
    }

    public void clickOnConfirm() {
        pmClickOnElement(confirm);
    }

    public void verifyThankYou() {
        verifyText("Thank you", thankYou, "Message is not display");
    }

    public void verifyOrderConfirmation() {
        verifyText("Your order has been successfully processed!", orderMessage, "Message does not display correctly");
    }

    public void clickOnContinue() {
        pmClickOnElement(continueClick);
    }

    public void clickOnRadioBtn2ndDayAir() {
        pmClickOnElement(radioBtn2ndDayAir);
    }

    public void inputVisaCardNumber(String vCardNumber) {
        sendTextToElement(visaCard, vCardNumber);
    }

    public void verifyShippingMethod2ndDayAir() {
        verifyText("2nd Day Air", shippingMethod, "2nd Day Air shipping method is not displayed");
    }

    public void verifyNokiaCartTotal() {
        verifyText("$698.00", total, "Total is not display correctly");
    }

}
