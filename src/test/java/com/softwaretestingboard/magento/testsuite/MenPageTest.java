package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenProductPage;
import com.softwaretestingboard.magento.pages.MenShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenPageTest extends BaseTest {
    HomePage home=new HomePage();
    MenProductPage productPage=new MenProductPage();
    MenShoppingCartPage shoppingCartPage=new MenShoppingCartPage();
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException{
        Thread.sleep(1000);
        // Mouse Hover on Men Menu
        home.mouseHoverOnMenMenu();
        // Mouse Hover on Bottoms
       home.mouseHoverOnBottom();
        // Click on Pants
       home.mouseHoverAndClickOnPants();
        // Mouse Hover on product name Cronus Yoga Pant and click on size 32.
       productPage.mouseHoverToCronus();
       productPage.clickOnPantSize();
        // Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
       productPage.clickOnBlackColour();

        // Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
        productPage.mouseHoverAndClickToAddCart();

        // // Verify the text You added Cronus Yoga Pant to your shopping cart.
       String actualheadingMessage=shoppingCartPage.verifyTextHeading();
        Assert.assertEquals(actualheadingMessage,"You added Cronus Yoga Pant to your shopping cart.","Wrong Message");
     // Click on ‘shopping cart’ Link into message
        shoppingCartPage.clickOnShoppingCartLink();
        Thread.sleep(2000);
        // Verify the text ‘Shopping Cart.'
        String actualShoppingCartText=shoppingCartPage.verifyShoppingCartText();
        Assert.assertEquals(actualShoppingCartText,"Shopping Cart","Wrong heading");
        // Verify the product name ‘Cronus Yoga Pant’
        String actualProductName=shoppingCartPage.verifyProductNameCronus();
        Assert.assertEquals(actualProductName,"Cronus Yoga Pant","Wrong product");
         // Verify the product size ‘32’
        String actualProductSize=shoppingCartPage.verifySizeOfProduct();
        Assert.assertEquals(actualProductSize,"32","Wrong Size");
        // Verify the product colour ‘Black’
        String actualProductColour=shoppingCartPage.verifycolorOfProduct();
        Assert.assertEquals(actualProductColour,"Black","Wrong colour");


    }

}
