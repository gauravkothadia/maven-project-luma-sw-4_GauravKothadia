package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.Women_Tops_JacketsPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * Project-3- ProjectName : luma-sw-4
 *  BaseUrl = https://magento.softwaretestingboard.com/
 *  Create the package ‘browserfactory’ and create the class with the name ‘Managebrowser’
 *  inside the ‘browserfactory’ package. And write the browser setup code inside the class
 *  ‘Managebrowser’.
 *  Create the package utilities and create the class with the name ‘Utility’ inside the ‘utilities’
 *  package. And write the all the utility methods in it’.
 *  Create the package pages and create all pages classes init.
 *  Create the package propertyreader and create the PropertyReader class init.
 *  ● Create testbase package and create TestBase class init.
 *  ● Create the testsuite package and create followin classes init.
 *  1. WomenTest
 *  2. MenTest
 *  3. GearTest
 *  1. Write down the following test into WomenTestclass
 *  1. verifyTheSortByProductNameFilter
 *  * Mouse Hover on Women Menu
 *  * Mouse Hover on Tops
 *  * Click on Jackets
 *  * Select Sort By filter “Product Name”
 *  * Verify the products name display in
 *  alphabetical order
 *  2. verifyTheSortByPriceFilter
 *  * Mouse Hover on Women Menu
 *  * Mouse Hover on Tops
 *  * Click on Jackets
 *  * Select Sort By filter “Price”
 *  * Verify the products price display in
 *  Low to High
 * 2. Write down the following test into ‘MenTest’
 *  class
 *  1. userShouldAddProductSuccessFullyTo
 *  ShoppinCart()
 *  * Mouse Hover on Men Menu
 *  * Mouse Hover on Bottoms
 *  * Click on Pants
 *  * Mouse Hover on product name
 *  ‘Cronus Yoga Pant’ and click on size
 *  32.
 *  * Mouse Hover on product name
 *  ‘Cronus Yoga Pant’ and click on colour
 *  Black.
 *  * Mouse Hover on product name
 *  ‘Cronus Yoga Pant’ and click on
 *  ‘Add To Cart’ Button.
 *  * Verify the text
 *  ‘You added Cronus Yoga Pant to your shopping cart.’
 *  * Click on ‘shopping cart’ Link into
 *  message
 *  * Verify the text ‘ShoppingCart.’
 *  * Verify the product name ‘CronusYogaPant’
 *  * Verify the product size ‘32’
 *  * Verify the product colour ‘Black’
 *  6.Write down the following test into ‘GearTest’ class
 *  1. userShouldAddProductSuccessFullyTo
 *  ShoppinCart()
 *  * Mouse Hover on Gear Menu
 *  * Click on Bags
 *  * Click on Product Name ‘Overnight Duffle’
 *  * Verify the text ‘Overnight Duffle’
 *  * Change Qty 3
 *  * Click on ‘Add to Cart’ Button.
 *  * Verify the text
 * ‘You added Overnight Duffle to your shopping cart.’
 *  * Click on ‘shopping cart’ Link into
 *  message
 *  * Verify the product name ‘CronusYogaPant’
 *  * Verify the Qty is ‘3’
 *  * Verify the product price ‘$135.00’
 *  * Change Qty to ‘5’
 *  * Click on ‘Update Shopping Cart’ button
 *  * Verify the product price ‘$225.00’
 */

public class WomenTest extends BaseTest {

    HomePage homePage = new HomePage();
    Women_Tops_JacketsPage womenTopJackets = new Women_Tops_JacketsPage();

    // 1. verifyTheSortByProductNameFilter
    @Test
    public void verifyTheSortByProductNameFilter() {
        // * Mouse Hover on Women Menu
        homePage.mouseHoverToWomenMenu();
        // * Mouse Hover on Tops
        homePage.mouseHoverToTopsSubMenu();
        // * Click on Jackets
        homePage.mouseHoverToAndClickOnJacketMenu();
        // * Select Sort By filter “Product Name”
        womenTopJackets.selectSortByOptionVisibleText("Product Name");
       // * Verify the products name display in alphabetical order
        List<String> productNames = womenTopJackets.getListOfProductNames();
        //Creating replica for comparison
        List<String> sortedNames = productNames;
        Collections.sort(sortedNames, Comparator.naturalOrder());
        Assert.assertEquals(productNames,sortedNames);
    }

    // 2. verifyTheSortByPriceFilter
    @Test
    public void verifyTheSortByPriceFilter() {
        // * Mouse Hover on Women Menu
        homePage.mouseHoverToWomenMenu();
        // * Mouse Hover on Tops
        homePage.mouseHoverToTopsSubMenu();
        // * Click on Jackets
        homePage.mouseHoverToAndClickOnJacketMenu();
        // * Select Sort By filter “Price”
        womenTopJackets.selectSortByOptionVisibleText("Price");
        selectByVisibleTextFromDropDown(By.id("sorter"), "Price");
        // * Verify the products price display in Low to High
        List<Double> priceList = womenTopJackets.getListOfProductPrices();
        //Creating replica for comparison
        List<Double> sortedNames = priceList;
        Collections.sort(sortedNames, Comparator.naturalOrder());
        Assert.assertEquals(priceList,sortedNames);
    }
}