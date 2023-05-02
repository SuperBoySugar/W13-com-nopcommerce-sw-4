package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utility.Utility;

public class NokiaLumiaPage extends Utility {

    By nokiaLumia1020 = By.cssSelector("div[class='product-name'] h1");
    By price = By.id("price-value-20");
    By quantity = By.id("product_enteredQuantity_20");
    By cartBtn = By.id("add-to-cart-button-20");
    By shoppingCartMessage = By.xpath("//p[@class='content']");
    By greenBtnClick = By.cssSelector("span[title='Close']");
    By shoppingCart = By.xpath("//span[text()='Shopping cart']");
    By goToCart = By.xpath("//button[text()='Go to cart']");


    public void verifyTheTextNokiaLumia1020() {
        verifyText("Nokia Lumia 1020", nokiaLumia1020, "Page is not display");
    }

    public void verifyThePrice() {
        verifyText("$349.00", price, "Price is not display correct");
    }

    public void changeQuantity() {
        sendTextToElement(quantity, Keys.BACK_SPACE + "2");
    }

    public void clickOnCartBtn() {
        pmClickOnElement(cartBtn);
    }

    public void verifyShoppingCartMessage() {
        verifyText("The product has been added to your shopping cart", shoppingCartMessage, "Message is not display");
    }

    public void clickOnGreenBtn() {
        pmClickOnElement(greenBtnClick);
    }

    public void mouseHoverOnShoppingCart() {
        doMouseHoverNoClick(shoppingCart);
    }

    public void clickOnGoToCart() {
        pmClickOnElement(goToCart);
    }

}
