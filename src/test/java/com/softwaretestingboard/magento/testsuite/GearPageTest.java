package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearPageTest extends BaseTest {
    HomePage homePage = new HomePage();
    GearPage gear = new GearPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException{
        // Mouse Hover on Gear Menu
        homePage.mouseHoverToGearMenu();
        // Click on Bags
        homePage.mouseHoverAndClickOnBag();
        // Click on Product Name ‘Overnight Duffle’
        gear.clickOnDuffleBag();

        //Verify the text ‘Overnight Duffle’
        String actualProductName = gear.productName();
        Assert.assertEquals(actualProductName, "Overnight Duffle", "Wrong message");
        // Change Qty 3
        gear.changeQuantitytoThree();
        // Click on ‘Add to Cart’ Button.
        gear.addToCart();

        // Verify the text ‘You added Overnight Duffle to your shopping cart.’
        String actualSuccessMessage = gear.verifyShoppingCart();
        Assert.assertEquals(actualSuccessMessage, "You added Overnight Duffle to your shopping cart.", "Wronge Product");

        // Click on ‘shopping cart’ Link into message
        gear.clickOnShoppingCart();
        Thread.sleep(2000);
        // Verify the product name ‘Overnight Duffle’
        String actualProductNameAfterAddInToCart = gear.verifyProductName();
        Assert.assertEquals(actualProductNameAfterAddInToCart, "Overnight Duffle", "Wrong message");
//Verify the Qty is ‘3’
        Thread.sleep(1000);
//        String actualQuantity = gear.verifyProductQuantity();
//        Assert.assertEquals(actualQuantity, "3", "Wrong Quantity");
        // Verify the product price ‘$135.00’
        String actualPriceBefore=gear.verifyProductPrice();
        Assert.assertEquals(actualPriceBefore,"$135.00","Wrong price");
        // Change Qty to ‘5’
        gear.changeQuantity();
// Click on ‘Update Shopping Cart’ button
        gear.clickOnUpdateButton();
        Thread.sleep(10000);
        // Verify the product price ‘$225.00’
        String actualPriceAfter=gear.verifyProductPrice();
        Assert.assertEquals(actualPriceBefore,"$225.00","Wrong price");
    }


}
