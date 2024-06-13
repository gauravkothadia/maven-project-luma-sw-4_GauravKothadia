package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By shoppingCartHeading = By.xpath("//span[@class='base']");
    By itemName = By.xpath("//td//strong[@class='product-item-name']//a");
    By itemSizeValue = By.xpath("//td//dt[contains(text(),'Size')]/following-sibling::dd[1]");
    By itemColorValue = By.xpath("//td//dt[contains(text(),'Color')]/following-sibling::dd[1]");
    By itemQuantityValue = By.xpath("//div[@class='control qty']//span[contains(text(),'Qty')]/following-sibling::input");
    By updateShoppingCartButton = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By productTotalPrice = By.xpath("//td[@class='col subtotal']//span[@class='price']");

    public String getShoppingCartHeading() {
        return getTextFromElement(shoppingCartHeading);
    }

    public String getItemName() {
        return getTextFromElement(itemName);
    }

    public String getItemSizeValue() {
        return getTextFromElement(itemSizeValue);
    }

    public String getItemColorValue() {
        return getTextFromElement(itemColorValue);
    }

    public String gettingQtyValue() {
        return getElementArributeValue(itemQuantityValue, "value");
    }

    public String verifyPrice135() {
        return getTextFromElement(productTotalPrice);
    }

    public void changeQty(String qty) {
        clearingText(itemQuantityValue);
        sendTextToElement(itemQuantityValue, qty);
    }
    public void clickOnUpdateShoppingCartButton(){
        clickOnElement(updateShoppingCartButton);
    }
    public String getProductTotalPrice(){
        refreshPage();
        return getTextFromElement(productTotalPrice);
    }
}
