package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility{

By dufflebagProduct=By.xpath("//a[normalize-space()='Overnight Duffle']");
By verifyBagName=By.xpath("//span[@class='base']");
By changeBagQuantity=By.xpath("//input[@id='qty']");
By addToCart=By.xpath("//button[@id='product-addtocart-button']");
By productAddedInShoppingCart =By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
By shoppingCartLink=By.xpath("//a[normalize-space()='shopping cart']");
By productName=By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");

By verifyProductQuantity=By.xpath("//input[@title='Qty']");

By verifyProductPrice=By.xpath("(//span[@class='cart-price']//span)[2]");

By changeQuantityInShoppingCart=By.xpath("(//input[@class='input-text qty'])[1]");

By clickOnUpdateShoppingCart=By.xpath("//span[normalize-space()='Update Shopping Cart']");
// Click on Product Name ‘Overnight Duffle’
    public void clickOnDuffleBag()
    {
        clickOnElement(dufflebagProduct);

    }
    // Verify the text ‘Overnight Duffle’
    public String productName()
    {
         return gettextFromElement(verifyBagName);
    }
    // Change Qty 3
    public void changeQuantitytoThree()
    {
        sendTextToElement(changeBagQuantity,"3");
    }
    // Click on ‘Add to Cart’ Button.
    public void addToCart()
    {
        clickOnElement(addToCart);
    }
public String verifyShoppingCart()
{
    return gettextFromElement(productAddedInShoppingCart);
}
// Click on ‘shopping cart’ Link into message
public void clickOnShoppingCart()
{
    clickOnElement(shoppingCartLink);
}
// Verify the product name ‘Overnight Duffle’
public String verifyProductName()
{
    return gettextFromElement(productName);
}
//Verify the Qty is ‘3’
public String verifyProductQuantity()
{
    return gettextFromElement(verifyProductQuantity);
}
    // Verify the product price ‘$135.00’
public String verifyProductPrice()
{
    return gettextFromElement(verifyProductPrice);
}
// Change Qty to ‘5’
    public void changeQuantity()
    {
        sendTextToElement(changeQuantityInShoppingCart,"5");
    }
    // Click on ‘Update Shopping Cart’ button
    public void clickOnUpdateButton()
    {
        clickOnElement(clickOnUpdateShoppingCart);
    }
    public String verifyProductPriceAfterUpdate()
    {
        return gettextFromElement(verifyProductPrice);
    }

}
