package testsuite;

import org.testng.annotations.Test;
import pages.*;
import testbase.BaseTest;

public class ComputersTest extends BaseTest {

    HomePage homePage = new HomePage();
    ComputersPage computersPage = new ComputersPage();
    DesktopsPage desktopsPage = new DesktopsPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    SignInPage signInPage = new SignInPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        homePage.selectComputersFromTopMenu("Computers");
        computersPage.clickOnDesktop();
        desktopsPage.selectZToAFromSortByDropdown();
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.selectComputersFromTopMenu("Computers");
        computersPage.clickOnDesktop();
        desktopsPage.selectAToZFromSortByDropdown("Name: A to Z");
        desktopsPage.clickOnAddToCart();
        buildYourOwnComputerPage.verifyBuildYourOwnComputerText();
        buildYourOwnComputerPage.selectProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
        buildYourOwnComputerPage.selectRAM("8GB [+$60.00]");
        buildYourOwnComputerPage.selectHDD();
        buildYourOwnComputerPage.selectOS();
        buildYourOwnComputerPage.selectSoftware();
        buildYourOwnComputerPage.clickOnAddToCart();
        buildYourOwnComputerPage.verifyAddToCartMessage();
        buildYourOwnComputerPage.clickOnCrossButton();
        buildYourOwnComputerPage.mouseHoverOnShoppingCart();
        buildYourOwnComputerPage.clickOnGoToCart();
        shoppingCartPage.verifyShoppingCartTitle();
        shoppingCartPage.changeQuantityAndUpdateCart("2");
        shoppingCartPage.verifyTotal();
        shoppingCartPage.clickOnTermsOfServiceCheckbox();
        shoppingCartPage.clickOnCheckOutBtn();
        signInPage.verifyWelcomeText();
        signInPage.clickOnCheckoutAsGuestBtn();
        checkoutPage.inputFirstName("Henry");
        checkoutPage.inputLastName("smith");
        checkoutPage.inputEmail(randomEmailGenerator());
        checkoutPage.selectCountry("India");
        checkoutPage.inputCity("London");
        checkoutPage.inputAddress("10 Downing Street");
        checkoutPage.inputZipCode("hr11 3de");
        checkoutPage.inputTelephoneNumber("79856435567");
        checkoutPage.clickOnContinueBtn();
        checkoutPage.clickOnNextDayAirRadioBtn();
        checkoutPage.clickOnContinueOnShipping();
        checkoutPage.clickOnCreditCard();
        checkoutPage.clickOnPaymentContinue();
        checkoutPage.selectCreditCard("Master Card");
        checkoutPage.inputCardHolderName("Rishi Sunak");
        checkoutPage.inputCardNumber("5356654814185420");
        checkoutPage.selectExpireMonth("09");
        checkoutPage.selectExpireYear("2026");
        checkoutPage.inputCardCode("123");
        checkoutPage.clickOnContinuCardPayment();
        checkoutPage.verifyPaymentMethod();
        checkoutPage.verifyShippingMethod();
        checkoutPage.verifyTotal();
        checkoutPage.clickOnConfirm();
        checkoutPage.verifyThankYou();
        checkoutPage.verifyOrderConfirmation();
        checkoutPage.clickOnContinue();
        homePage.verifyTheTextWelcomeToOurStore();

    }
}
