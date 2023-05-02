package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class ComputersPage extends Utility {

    By desktops = By.xpath("//div[@class='block block-category-navigation']/descendant::a[2]");

    public void clickOnDesktop(){
        pmClickOnElement(desktops);
    }
}
