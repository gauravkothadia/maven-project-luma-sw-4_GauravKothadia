package com.softwaretestingboard.magento.testsuite;
/**
 * 2. Write down the following test into ‘MenTest’
 * class
 * 1. userShouldAddProductSuccessFullyTo
 * ShoppinCart()
 * * Mouse Hover on Men Menu
 * * Mouse Hover on Bottoms
 * * Click on Pants
 * * Mouse Hover on product name
 * ‘Cronus Yoga Pant’ and click on size
 * 32.
 * * Mouse Hover on product name
 * ‘Cronus Yoga Pant’ and click on colour
 * Black.
 * * Mouse Hover on product name
 * ‘Cronus Yoga Pant’ and click on
 * ‘Add To Cart’ Button.
 * * Verify the text
 * ‘You added Cronus Yoga Pant to your shopping cart.’
 * * Click on ‘shopping cart’ Link into
 * message
 * * Verify the text ‘ShoppingCart.’
 * * Verify the product name ‘CronusYogaPant’
 * * Verify the product size ‘32’
 * * Verify the product colour ‘Black’
 */


import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.Men_Bottoms_PantsPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MenTest extends BaseTest {

    HomePage homePage = new HomePage();
    Men_Bottoms_PantsPage menBottomsPantsPage = new Men_Bottoms_PantsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() {
        // Mouse Hover on Men Menu
        homePage.mouseHoverToMenMenu();
        //Mouse Hover on Bottoms
        homePage.mouseHoverToBottomsSubMenu();
        //Click on Pants
        homePage.mouseHoverToAndClickOnPantsMenu();
        //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        menBottomsPantsPage.mouseHoverToCronusYogaPantName();
        menBottomsPantsPage.mouseHoverAndClickOnSize32();
        //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        menBottomsPantsPage.mouseHoverToCronusYogaPantName();
        menBottomsPantsPage.mouseHoverAndClickOnColorBlack();
        //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        menBottomsPantsPage.mouseHoverToCronusYogaPantName();
        menBottomsPantsPage.mouseHoverAndClickOnCronusYogaPantAddToCartButton();
        //Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        String expectedText = "You added Cronus Yoga Pant to your shopping cart.";
        Assert.assertEquals(menBottomsPantsPage.getProductAddedMessage(), expectedText);
        //Click on ‘shopping cart’ Link into message
        menBottomsPantsPage.clickOnShoppingCartLinkInMessage();
        //Verify the text ‘Shopping Cart.’
        String expectedHeading = "Shopping Cart";
        Assert.assertEquals(shoppingCartPage.getShoppingCartHeading(), expectedHeading);
        //Verify the product name ‘Cronus Yoga Pant’
        String expectedProduct = "Cronus Yoga Pant";
        Assert.assertEquals(shoppingCartPage.getItemName(), expectedProduct);
        // Verify the product size ‘32’
        String expectedSize = "32";
        Assert.assertEquals(shoppingCartPage.getItemSizeValue(), expectedSize);
        //Verify the product colour ‘Black’
        String expectedColor = "Black";
        Assert.assertEquals(shoppingCartPage.getItemColorValue(), expectedColor);
    }
}
