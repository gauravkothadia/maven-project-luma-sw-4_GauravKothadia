package com.softwaretestingboard.magento.testsuite;
  /*
    1. userShouldAddProductSuccessFullyToShoppinCart()
 * Mouse Hover on Gear Menu
 * Click on Bags
 * Click on Product Name ‘Overnight Duffle’
 * Verify the text ‘Overnight Duffle’
 * Change Qty 3
 * Click on ‘Add to Cart’ Button.
 * Verify the text ‘You added Overnight Duffle to your shopping cart.’
 * Click on ‘shopping cart’ Link into message
 * Verify the product name ‘CronusYogaPant’
 * Verify the Qty is ‘3’
 * Verify the product price ‘$135.00’
 * Change Qty to ‘5’
 * Click on ‘Update Shopping Cart’ button
 * Verify the product price ‘$225.00
     */
import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OvernightDufflePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    HomePage homePage = new HomePage();
    BagsPage bagsPage = new BagsPage();
    OvernightDufflePage overnightDufflePage = new OvernightDufflePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessfullyToShoppingCart(){
        //Mouse Hover on Gear Menu
        homePage.mouseHoverToGear();
        //Click on Bags
        homePage.clickOnBags();
        //Click on Product Name ‘Overnight Duffle’
        bagsPage.clickOnOvernightDuffle();
        //Verify the text ‘Overnight Duffle’
        String expectedText = "Overnight Duffle";
        String actualText = overnightDufflePage.verifyOvernightDuffleText();
        Assert.assertEquals(actualText,expectedText,"Overnight Duffle");
        //Change Qty 3
        overnightDufflePage.changeQtyTo3("3");
        //Click on ‘Add to Cart’ Button.
        overnightDufflePage.clickOnAddToCartButton();
        //Verify the text 'You added Overnight Duffle to your shopping cart.’
        String expectedMessage = "You added Overnight Duffle to your shopping cart.";
        Assert.assertEquals(overnightDufflePage.getProductAddedMessage(), expectedMessage);
        //Click on ‘shopping cart’ Link into message
        overnightDufflePage.clickOnShoppingCartLinkInMessage();
        //Verify the product name ‘Overnight Duffle’
        Assert.assertEquals(shoppingCartPage.getItemName(),"Overnight Duffle");
        //Verify the Qty is ‘3’
        Assert.assertEquals(shoppingCartPage.gettingQtyValue(),"3");
        //Verify the product price ‘$135.00’
        String expectedPrice = "$135.00";
        String actualPrice = shoppingCartPage.verifyPrice135();
        Assert.assertEquals(actualPrice, expectedPrice);
        //Change Qty to ‘5’
        shoppingCartPage.changeQty("5");
        //Click on ‘Update Shopping Cart’ button
        shoppingCartPage.clickOnUpdateShoppingCartButton();
        //Verify the product price ‘$225.00
        String expectedPrice1 = "$225.00";
        String actualTextPrice2 = shoppingCartPage.getProductTotalPrice();
        Assert.assertEquals(actualTextPrice2, expectedPrice1);
    }
}
