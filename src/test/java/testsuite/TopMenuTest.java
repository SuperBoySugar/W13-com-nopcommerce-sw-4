package testsuite;

import org.testng.annotations.Test;
import pages.*;
import testbase.BaseTest;

public class TopMenuTest extends BaseTest {

    HomePage homePage = new HomePage();

    @Test
    public void verifyPageNavigation() {
        // Verify Computer page navigation
        homePage.verifyComputersPageNavigation();
        // Verify Computer text
        homePage.verifyComputerText();
        // Verify Electronics page navigation
        homePage.verifyElectronicsPageNavigation();
        // Verify Electronic text
        homePage.verifyElectronicsText();
        // Verify Apparel page navigation
        homePage.verifyApparelPageNavigation();
        // Verify Apparel text
        homePage.verifyApparelText();
        // Verify Digital Downloads page navigation
        homePage.verifyDigitalDownloadsPageNavigation();
        homePage.verifyDigitalDownloadsText();
        // Verify Books page navigation
        homePage.verifyBooksPageNavigation();
        homePage.verifyBooksText();
        // Verify Jewelry page navigation
        homePage.verifyJewelryPageNavigation();
        homePage.verifyJewelryText();
        // Verify Gift Cards page navigation
        homePage.verifyGiftCardsPageNavigation();
        homePage.verifyGiftCardsText();
    }
}
