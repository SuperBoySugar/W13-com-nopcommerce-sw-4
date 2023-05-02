package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import utility.Utility;

public class ShoppingCartPage extends Utility {
    By shoppingCart = By.xpath("//h1[text()='Shopping cart']");
    By quantity = By.xpath("//input[@class='qty-input']");
    By updateCartBtn = By.id("updatecart");
    By total = By.xpath("//span[@class='value-summary']//strong");
    By termsOfService = By.id("termsofservice");
    By checkOutBtn = By.id("checkout");

    // Verifying Shopping cart title
    public void verifyShoppingCartTitle() {
        verifyText("Shopping cart", shoppingCart, "Title is not display as expected ");
    }

    // Change quality and click update cart button
    public void changeQuantityAndUpdateCart(String qty) {
        sendTextToElement(quantity, Keys.BACK_SPACE + qty);
        pmClickOnElement(updateCartBtn);
    }

    // Verifying total
    public void verifyTotal() {
        verifyText("$2,950.00", total, "Total price is not displayed as expected");
    }

    // Clicking on Terms Of Service chekbox
    public void clickOnTermsOfServiceCheckbox() {
        pmClickOnElement(termsOfService);
    }

    // Clicking on Checkout button
    public void clickOnCheckOutBtn() {
        pmClickOnElement(checkOutBtn);
    }


    // ********************** Nokia Lumia Shopping Cart ********************

    By quantityNokia = By.xpath("//tbody/tr[1]/td[5]/input[1]");


    public void verifyTheQuantity() {
        String expectedMessage = "2";
        String actualMessage = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]")).getAttribute("value");
        Assert.assertEquals("2", expectedMessage, actualMessage);
    }
    public void verifyNokiaCartTotal(){
        verifyText("$698.00", total, "Total price is not displayed as expected");

    }

}
