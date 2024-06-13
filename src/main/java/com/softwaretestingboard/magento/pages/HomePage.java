package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By womenMenu = By.xpath("//nav[@class='navigation']//span[contains(text(),'Women')]/parent::a");
    By topsMenu = By.xpath("//li[@class='level1 nav-2-1 category-item first parent ui-menu-item']//span[contains(text(),'Tops')]/parent::a");
    By jacketMenu = By.xpath("//li[@class='level2 nav-2-1-1 category-item first ui-menu-item']//span[contains(text(),'Jackets')]/parent::a");
    By menMenu = By.xpath("//span[normalize-space()='Men']");
    By bottomsMenu = By.cssSelector("a[id='ui-id-18'] span:nth-child(1)");
    By pantsMenu = By.cssSelector("a[id='ui-id-23'] span");
    By mouseHoverGear = By.xpath("//span[normalize-space()='Gear']");
    By clickBags = By.xpath("//span[normalize-space()='Bags']");

    public void mouseHoverToWomenMenu(){
        mouseHoverToElement(womenMenu);
    }
    public void mouseHoverToTopsSubMenu(){
        mouseHoverToElement(topsMenu);
    }
    public void mouseHoverToAndClickOnJacketMenu(){
        mouseHoverToElementAndClick(jacketMenu);
    }
    public void mouseHoverToMenMenu(){
        mouseHoverToElement(menMenu);
    }
    public void mouseHoverToBottomsSubMenu(){
        mouseHoverToElement(bottomsMenu);
    }
    public void mouseHoverToAndClickOnPantsMenu(){
        mouseHoverToElementAndClick(pantsMenu);
    }
    public void mouseHoverToGear(){
        mouseHoverToElement(mouseHoverGear);
    }
    public void clickOnBags(){
        clickOnElement(clickBags);
    }
}
