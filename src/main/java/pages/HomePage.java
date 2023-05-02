package pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import utility.Utility;

public class HomePage extends Utility {


    By topMenu = By.xpath("//ul[@class='top-menu notmobile']//li//a");
    By computersText = By.xpath("//h1[contains (text(), 'Computers')]");
    By electronicsText = By.xpath("//h1[contains (text(), 'Electronics')]");
    By apparelText = By.xpath("//h1[contains (text(), 'Apparel')]");
    By digitalDownloadsText = By.xpath("//h1[contains (text(), 'Digital downloads')]");
    By booksText = By.xpath("//h1[contains (text(), 'Books')]");
    By jewelryText = By.xpath("//h1[contains (text(), 'Jewelry')]");
    By giftCardsText = By.xpath("//h1[contains (text(), 'Gift Cards')]");
    By welcomeMessage = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By logout = By.xpath("//a[contains(text(),'Log out')]");

    public void verifyComputersPageNavigation() {
        selectMenu(topMenu, "Computers");
    }

    public void verifyComputerText() {
        verifyText("Computers", computersText, "Computers page is not displayed");
    }

    public void verifyElectronicsPageNavigation() {
        selectMenu(topMenu, "Electronics");
    }

    public void verifyElectronicsText() {
        verifyText("Electronics", electronicsText, "Electronics page is not displayed");
    }

    public void verifyApparelPageNavigation() {
        selectMenu(topMenu, "Apparel");
    }

    public void verifyApparelText() {
        verifyText("Apparel", apparelText, "Apparel page is not displayed");
    }

    public void verifyDigitalDownloadsPageNavigation() {
        selectMenu(topMenu, "Digital downloads");
    }

    public void verifyDigitalDownloadsText() {
        verifyText("Digital downloads", digitalDownloadsText, "DigitalDownloads page is not displayed");
    }

    public void verifyBooksPageNavigation() {
        selectMenu(topMenu, "Books");
    }

    public void verifyBooksText() {
        verifyText("Books", booksText, "DigitalDownloads page is not displayed");
    }

    public void verifyJewelryPageNavigation() {
        selectMenu(topMenu, "Jewelry");
    }

    public void verifyJewelryText() {
        verifyText("Jewelry", jewelryText, "DigitalDownloads page is not displayed");
    }

    public void verifyGiftCardsPageNavigation() {
        selectMenu(topMenu, "Gift Cards");
    }

    public void verifyGiftCardsText() {
        verifyText("Gift Cards", giftCardsText, "DigitalDownloads page is not displayed");
    }

    public void selectComputersFromTopMenu(String menu) {
        selectMenu(topMenu, menu);

    }

    public void verifyTheTextWelcomeToOurStore() {
        verifyText("Welcome to our store", welcomeMessage, "Welcome message is not display");
    }

    //**************** Electronics Test****************************

    By electronics = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By cellPhones = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");

    public void mouseHoverOnElectronics(){
        doMouseHoverNoClick(electronics);
    }

    public void mouseHoverAndClickOnCellPhones(){
        doMouseHoverAndClick(cellPhones);
    }

    public void clickOnLogoutLink(){
        pmClickOnElement(logout);
    }

    public void getURL(){
        String url = driver.getCurrentUrl();
        Assert.assertEquals("The URL is incorrect", url, "https://demo.nopcommerce.com/");
    }
}
