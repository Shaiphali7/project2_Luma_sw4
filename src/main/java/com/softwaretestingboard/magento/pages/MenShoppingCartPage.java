package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenShoppingCartPage extends Utility {
    // Verify the text You added Cronus Yoga Pant to your shopping cart.
    By verifyTextHeading=By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    public String verifyTextHeading()
    {
        return gettextFromElement(verifyTextHeading);
    }


    // Click on ‘shopping cart’ Link into message
    By clickOnShoppingCartLink=By.xpath("//a[normalize-space()='shopping cart']");
    public void clickOnShoppingCartLink()
    {
        clickOnElement(clickOnShoppingCartLink);
    }

    // Verify the text ‘Shopping Cart.'
    By verifyShoppingCartText=By.xpath("//span[@class='base']");
    public String verifyShoppingCartText()
    {
        return gettextFromElement(verifyShoppingCartText);
    }


    // Verify the product name ‘Cronus Yoga Pant’
    By verifyProductNameCronus=By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    public String verifyProductNameCronus()
    {
        return gettextFromElement(verifyProductNameCronus);
    }
    // Verify the product size ‘32’
    By verifySizeOfProduct=By.xpath("//dd[contains(text(),'32')]");
    public String verifySizeOfProduct()
    {
        return gettextFromElement(verifySizeOfProduct);
    }


    // Verify the product colour ‘Black’
    By verifycolorOfProduct=By.xpath("//dd[contains(text(),'Black')]");
    public String verifycolorOfProduct()
    {
        return gettextFromElement(verifycolorOfProduct);
    }
}
