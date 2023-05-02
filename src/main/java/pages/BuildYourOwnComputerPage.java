package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class BuildYourOwnComputerPage extends Utility {

    By computerText = By.xpath("//h1[text()='Build your own computer']");
    By processor = By.id("product_attribute_1");
    By ram = By.id("product_attribute_2");
    By hdd = By.id("product_attribute_3_7");
    By os = By.id("product_attribute_4_9");
    By software = By.id("product_attribute_5_12");
    By price = By.id("price-value-1");
    By addToCart = By.id("add-to-cart-button-1");
    By addToCartMessage = By.xpath("//p[text()='The product has been added to your ']");
    By crossButton = By.xpath("//span[@title='Close']");
    By shoppingCart = By.xpath("//span[text()='Shopping cart']");
    By goToCart = By.xpath("//button[text()='Go to cart']");

    // Verify 'Build your own computer' text
    public void verifyBuildYourOwnComputerText() {
        verifyText("Build your own computer", computerText, "Title is not displayed as expected");
    }

    // Selecting Processor
    public void selectProcessor(String processor1) {
        pmSelectByVisibleTextFromDropDown(processor, processor1);
    }

    // Selecting RAM
    public void selectRAM(String ram1) {
        pmSelectByVisibleTextFromDropDown(ram, ram1);
    }

    // Selecting HDDD
    public void selectHDD() {
        pmClickOnElement(hdd);
    }

    // Selecting Operating System
    public void selectOS() {
        pmClickOnElement(os);
    }

    // Selecting Software
    public void selectSoftware() {
        pmClickOnElement(software);
    }

    // Verifying Price
    public void verifyThePrice() {
        verifyText("$1,475.00", price, "Price not display correctly");
    }

    // Clicking on Add to Cart button
    public void clickOnAddToCart() {
        pmClickOnElement(addToCart);
    }

    // Verifying message that product added to cart
    public void verifyAddToCartMessage() {
        verifyText("The product has been added to your shopping cart",
                addToCartMessage, "Message not Display");
    }

    // Clicking on Cross button
    public void clickOnCrossButton() {
        pmClickOnElement(crossButton);
    }

    // Mouse hover on Shopping Cart
    public void mouseHoverOnShoppingCart() {
        doMouseHoverNoClick(shoppingCart);
    }

    // Clicking on Go To Cart
    public void clickOnGoToCart() {
        pmClickOnElement(goToCart);
    }

}
