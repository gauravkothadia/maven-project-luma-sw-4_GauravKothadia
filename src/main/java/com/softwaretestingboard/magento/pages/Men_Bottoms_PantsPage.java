package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class Men_Bottoms_PantsPage extends Utility {

    By cronusYogaPantLink = By.xpath("//a[@class='product-item-link'][normalize-space()='Cronus Yoga Pant']");
    By cronusYogaPantSize32 = By.xpath("//a[@class='product-item-link'][normalize-space()='Cronus Yoga Pant']/parent::strong/following-sibling::div[2]//child::div[@attribute-code='size']//div[contains(text(),'32')]");
    By cronusYogaPantColorBlack = By.xpath("//a[@class='product-item-link'][normalize-space()='Cronus Yoga Pant']/parent::strong/following-sibling::div[2]//child::div[@attribute-code='color']//div[contains(@option-label,'Black')]");
    By cronusYogaPantAddToCartButton = By.xpath("//a[@class='product-item-link'][normalize-space()='Cronus Yoga Pant']//ancestor::div[@class='product details product-item-details']//div[@class='product-item-inner']//button[@title='Add to Cart']");
    By productAddedMessage = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLinkInMessage = By.xpath("//a[normalize-space()='shopping cart']");

    public void mouseHoverToCronusYogaPantName(){
        mouseHoverToElement(cronusYogaPantLink);
    }
    public void mouseHoverAndClickOnSize32(){
        mouseHoverToElementAndClick(cronusYogaPantSize32);
    }
    public void mouseHoverAndClickOnColorBlack(){
        mouseHoverToElementAndClick(cronusYogaPantColorBlack);
    }
    public void mouseHoverAndClickOnCronusYogaPantAddToCartButton(){
        mouseHoverToElementAndClick(cronusYogaPantAddToCartButton);
    }
    public String getProductAddedMessage(){
        return getTextFromElement(productAddedMessage);
    }
    public void clickOnShoppingCartLinkInMessage(){
        clickOnElement(shoppingCartLinkInMessage);
    }
}
