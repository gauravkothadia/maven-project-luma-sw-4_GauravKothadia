package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Women_Tops_JacketsPage extends Utility {

    By positionDropdown = By.xpath("(//select[@id='sorter'])[1]");
    By listOfProductNameElement = By.cssSelector(".product-item-info a.product-item-link");
    By listOfProductPriceElement = By.xpath("//span[@class='normal-price']//span[@class='price']");


    public void selectSortByOptionVisibleText(String name){
        selectByVisibleTextFromDropDown(positionDropdown,name);
    }

    public List<String> getListOfProductNames(){
        List<WebElement> elementList = findMultipleElements(listOfProductNameElement);
        List<String> productNameList = new ArrayList<>();
        for(WebElement ele : elementList){
            if (!ele.isDisplayed()) {
                scrollToElement(ele);
            }
            productNameList.add(ele.getText());
        }
        return productNameList;
    }

    public List<Double> getListOfProductPrices(){
        List<WebElement> elementList = findMultipleElements(listOfProductPriceElement);
        List<Double> productPriceList = new ArrayList<>();
        for(WebElement ele : elementList){
            if (!ele.isDisplayed()) {
                scrollToElement(ele);
            }
            productPriceList.add(Double.parseDouble(ele.getText().trim().substring(1)));
        }
        return productPriceList;
    }
}
