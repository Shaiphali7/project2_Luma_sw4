package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WomenProduct extends Utility {
    By jacketElements =By.xpath("//span[normalize-space()='Women']");
    By dropDown=By.xpath("(//select[@id='sorter'])[1]");
    public List<String> getJacketElements() {
        List<WebElement> jacketsElementsList = driver.findElements(jacketElements);
        List<String> jacketsNameList = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameList.add(value.getText());
        }
        return jacketsNameList;
    }
    public void selectSortByFilter()
    {
        selectByVisibleTextFromDropDown(dropDown,"Product Name");
    }
    By sortByPrice = By.xpath("(//select[@id='sorter'])[1]");

    By priceElements = By.xpath("//span[@class='price-wrapper ']//span");

    public void sortByPrice() {

        selectByVisibleTextFromDropDown(sortByPrice, "Price");
    }
    public List<String> getPriceElements() {
        List<WebElement> priceElementsList = driver.findElements(priceElements);
        List<String> priceList = new ArrayList<>();
        for (WebElement price : priceElementsList) {
            priceList.add(price.getText());
        }
        return priceList;
    }


}
