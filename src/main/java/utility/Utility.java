package utility;

import browserfactory.ManageBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.Random;


public class Utility extends ManageBrowser {

    /**
     * This method will click on element
     *
     * @ param by
     */
    public void pmClickOnElement(By by) {
        WebElement link = driver.findElement(by);
        link.click();
    }

    /**
     * This method will get text from element
     */
    public String doGetTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    /**
     * This method will send text on element
     */
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }


    public void selectMenu(By by, String menu) {
        List<WebElement> names = driver.findElements(by);
        for (WebElement name : names) {
//            Thread.sleep(1000);
            if (name.getText().equalsIgnoreCase(menu)) {
//                Thread.sleep(1000);
                name.click();
                break;
            }
        }
    }

    /**
     * This Method will verify text using Assert
     */
    public void verifyText(String expectedMessage, By by, String displayMessage) {
        String actualMessage = doGetTextFromElement(by);
        Assert.assertEquals(actualMessage, expectedMessage, displayMessage);
    }

    //*************************** Select Class Methods ***************************************//

    /**
     * This method will select the option by visible text
     */
    public void pmSelectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }


//*************************** Action Methods ***************************************//


    /**
     * This method will use to hover mouse on element
     */
    public void doMouseHoverNoClick(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }

    /**
     * This method will mouse hover and Click on element
     */
    public void doMouseHoverAndClick(By by) {
        Actions hover = new Actions(driver);
        WebElement a = driver.findElement(by);
        hover.moveToElement(a).click().build().perform();
    }


    // Generate Random email
    public String randomEmailGenerator() {
        String chars = "abcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder email = new StringBuilder();
        Random randomEmail = new Random();
        while (email.length() < 10) {
            int index = (int) (randomEmail.nextFloat() * chars.length());
            email.append(chars.charAt(index));
        }
        String saltStr = (email.toString() + "@gmail.com");
        return saltStr;
    }


}
