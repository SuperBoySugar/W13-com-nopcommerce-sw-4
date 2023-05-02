package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class CellPhones extends Utility {

    By cellPhones = By.xpath("//h1[text()='Cell phones']");
    By listView = By.xpath("//a[contains(text(),'List')]");
    By productNokiaLumia1020 = By.cssSelector("div:nth-of-type(3) > .product-item h2 > a");


    public void verifyTheTextCellPhones() {
        verifyText("Cell phones", cellPhones, "Page is not not display");
    }

    public void clickOnListTab() {
        pmClickOnElement(listView);
    }

    public void clickOnProductNokiaLumia1020() {
        pmClickOnElement(productNokiaLumia1020);
    }


}
