package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility
{

    By gearMenu=By.xpath("//a[@id='ui-id-6']//span[text()='Gear']");
    By clickOnBag=By.xpath("//span[normalize-space()='Bags']");
    // Mouse Hover on Men Menu
    By menMenu=By.xpath("//span[normalize-space()='Men']");
    public void mouseHoverOnMenMenu()
    {
        mouseHoverToElement(menMenu);
    }


    // Mouse Hover on Bottoms
    By mouseHoverOnBottom=By.xpath("//a[@id='ui-id-18']");

    public void mouseHoverOnBottom()
    {
        mouseHoverToElement(mouseHoverOnBottom);
    }

    // Click on Pants
    By mouseHoverandClickOnPants=By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    public void mouseHoverAndClickOnPants()
    {
        mouseHoverToElementAndClick(mouseHoverandClickOnPants);
    }


    // Mouse Hover on Gear Menu
    public void mouseHoverToGearMenu()
    {
        mouseHoverToElement(gearMenu);
    }
    // Click on Bags
    public void mouseHoverAndClickOnBag()
    {
        mouseHoverToElementAndClick(clickOnBag);
    }
    //For women Menu
    By womenMenu=By.xpath("//span[normalize-space()='Women']");
   public void mouseHoverOnWomenMenu()
   {
       mouseHoverToElement(womenMenu);
   }
   By womenMenuTops=By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
   public void mouseHoverOnTops()
   {
       mouseHoverToElement(womenMenuTops);
   }

    By womenMenuJackets=By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    public void mouseHoverAndClickOnJacket()
    {
        mouseHoverToElementAndClick(womenMenuJackets);
    }

}
