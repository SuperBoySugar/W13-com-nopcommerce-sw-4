package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class DesktopsPage extends Utility {

    By sortByDropdown = By.id("products-orderby");
    By addToCart = By.cssSelector("div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > button:nth-child(1)");

    public void selectZToAFromSortByDropdown() {
        pmSelectByVisibleTextFromDropDown(sortByDropdown, "Name: Z to A");
    }

    public void selectAToZFromSortByDropdown(String filter) {
        pmSelectByVisibleTextFromDropDown(sortByDropdown, filter);
    }

    public void clickOnAddToCart() throws InterruptedException {
        Thread.sleep(1000);
        pmClickOnElement(addToCart);
    }


}
