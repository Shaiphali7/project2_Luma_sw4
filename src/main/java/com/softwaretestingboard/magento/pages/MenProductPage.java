package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenProductPage extends Utility {
    // Mouse Hover on product name Cronus Yoga Pant and click on size 32.
    By mouseHoverToCronus=By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    public void mouseHoverToCronus()
    {
        mouseHoverToElement(mouseHoverToCronus);
    }
    By clickOnPantSize=By.xpath("(//div[@class='swatch-option text'])[1]");
    public void clickOnPantSize()
    {
        mouseHoverToElementAndClick(clickOnPantSize);
    }

    // Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
    By clickOnBlackColour=By.xpath("(//div[@class='swatch-option color'])[1]");
    public void clickOnBlackColour()
    {
        mouseHoverToElementAndClick(clickOnBlackColour);
    }

    // Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.

    By mouseHoverAndClickToAddCart=By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    public void mouseHoverAndClickToAddCart()
    {
        mouseHoverToElementAndClick(mouseHoverAndClickToAddCart);
    }



}
