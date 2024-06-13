package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class OvernightDufflePage extends Utility {
    By verifyText = By.xpath("//span[@class='base']");
    By changeQty = By.xpath("//input[@id='qty']");
    By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
    By productAddedMessage = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLinkInMessage = By.xpath("//a[normalize-space()='shopping cart']");

    public String verifyOvernightDuffleText(){
        return getTextFromElement(verifyText);
    }
    public void changeQtyTo3(String quantity){
        clearingText(changeQty);
        sendTextToElement(changeQty, quantity);
    }
    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }

    public String getProductAddedMessage(){
        return getTextFromElement(productAddedMessage);
    }
    public void clickOnShoppingCartLinkInMessage(){
        clickOnElement(shoppingCartLinkInMessage);
    }
}
