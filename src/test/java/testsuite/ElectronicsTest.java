package testsuite;

import org.testng.annotations.Test;
import pages.*;
import testbase.BaseTest;

public class ElectronicsTest extends BaseTest {

    HomePage homePage = new HomePage();
    CellPhones cellPhones = new CellPhones();
    NokiaLumiaPage nokiaLumiaPage = new NokiaLumiaPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    SignInPage signInPage = new SignInPage();
    RegisterPage registerPage = new RegisterPage();
    CheckoutPage checkoutPage = new CheckoutPage();


    @Test
    public void verifyUserShouldNavigateToCellPhonePageSuccessfully() {

        homePage.mouseHoverOnElectronics();
        homePage.mouseHoverAndClickOnCellPhones();
        cellPhones.verifyTheTextCellPhones();
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homePage.mouseHoverOnElectronics();
        homePage.mouseHoverAndClickOnCellPhones();
        cellPhones.verifyTheTextCellPhones();
        cellPhones.clickOnListTab();
        Thread.sleep(1000);
        cellPhones.clickOnProductNokiaLumia1020();
        nokiaLumiaPage.verifyTheTextNokiaLumia1020();
        nokiaLumiaPage.verifyThePrice();
        nokiaLumiaPage.changeQuantity();
        nokiaLumiaPage.clickOnCartBtn();
        nokiaLumiaPage.verifyShoppingCartMessage();
        nokiaLumiaPage.clickOnGreenBtn();
        nokiaLumiaPage.mouseHoverOnShoppingCart();
        nokiaLumiaPage.clickOnGoToCart();
        shoppingCartPage.verifyShoppingCartTitle();
        shoppingCartPage.verifyTheQuantity();
        shoppingCartPage.verifyNokiaCartTotal();
        shoppingCartPage.clickOnTermsOfServiceCheckbox();
        shoppingCartPage.clickOnCheckOutBtn();
        signInPage.verifyWelcomeText();
        signInPage.clickOnRegisterBtn();
        registerPage.verifyTextRegister();
        registerPage.inputFirstNameField("Henry");
        registerPage.lastNameField("Smith");
        registerPage.emailField(randomEmailGenerator());
        registerPage.passwordField("Password123");
        registerPage.confirmPasswordField("Password123");
        registerPage.clickOnRegister();
        registerPage.verifyRegisterTextMessage();
        registerPage.clickOnContinueBtn();
        shoppingCartPage.verifyShoppingCartTitle();
        shoppingCartPage.clickOnTermsOfServiceCheckbox();
        shoppingCartPage.clickOnCheckOutBtn();
        checkoutPage.selectCountry("India");
        checkoutPage.inputCity("London");
        checkoutPage.inputAddress("123 London Road");
        checkoutPage.inputZipCode("SW1 1AA");
        checkoutPage.inputTelephoneNumber("0192929292");
        checkoutPage.clickOnContinue();
        checkoutPage.clickOnRadioBtn2ndDayAir();
        checkoutPage.clickOnContinueOnShipping();
        checkoutPage.clickOnCreditCard();
        checkoutPage.clickOnPaymentContinue();
        checkoutPage.inputCardHolderName("Rishi Patel");
        checkoutPage.inputVisaCardNumber("4700 1234 5678 7840");
        checkoutPage.selectExpireMonth("11");
        checkoutPage.selectExpireYear("2025");
        checkoutPage.inputCardCode("123");
        checkoutPage.clickOnContinuCardPayment();
        checkoutPage.verifyPaymentMethod();
        checkoutPage.verifyShippingMethod2ndDayAir();
        checkoutPage.verifyNokiaCartTotal();
        checkoutPage.clickOnConfirm();
        checkoutPage.verifyThankYou();
        checkoutPage.verifyOrderConfirmation();
        checkoutPage.clickOnContinue();
        homePage.verifyTheTextWelcomeToOurStore();
        homePage.clickOnLogoutLink();
        homePage.getURL();
    }

}
