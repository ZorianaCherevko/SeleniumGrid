package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SmokeTests extends BaseTests{

    private String EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART = "0";

    @Test(priority = 2)
    public void checkRemoveFromCart() {
        getHomePage().clickCatalog();
        getHomePage().isclickPhonesVisible();
        getHomePage().clickPhones();
        getCatalogPage().waitForLoadPAgeComplete(10);
        getCatalogPage().clickWatches();
        getSearchResultsPage().waitForLoadPAgeComplete(10);
        getSearchResultsPage().clickSmartBand();
        getProductPage().waitForLoadPAgeComplete(10);
        getProductPage().clickAddToCartbutton();
        getProductPage().waitVisibilityOfElement(30, getProductPage().getAddToCartPopup());
        getProductPage().clickARemove();
        getProductPage().waitVisibilityOfElement(30,getProductPage().getMessageAfterRemovingItem());
        getProductPage().clickCloseCartPopup();
        Assert.assertEquals(getProductPage().getTextOfAmountProductsInCart(), EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART);
    }

    @Test
    public void checkAddToCompareList() {
        getHomePage().clickCatalog();
        getHomePage().isclickPhonesVisible();
        getHomePage().clickPhones();
        getCatalogPage().waitForLoadPAgeComplete(10);
        getCatalogPage().clickWatches();
        getSearchResultsPage().waitForLoadPAgeComplete(10);
        getSearchResultsPage().clickSmartBand();
        getProductPage().waitForLoadPAgeComplete(10);
        getProductPage().clickAddToComparebutton();
        getProductPage().waitForLoadPAgeComplete(10);
        getProductPage().clickBreadCrumbXiaomi();
        getSearchResultsPage().waitForLoadPAgeComplete(10);
        getSearchResultsPage().clickAnotherSmartBand();
        getProductPage().waitForLoadPAgeComplete(10);
        getProductPage().clickAddToComparebutton();
        getProductPage().waitForLoadPAgeComplete(10);
        getProductPage().clickBreadCrumbXiaomi();
        getSearchResultsPage().waitVisibilityOfElement(30, getSearchResultsPage().getCompareButtonVisible());
        assertEquals(getSearchResultsPage().getItemsToCompareList(), 2);
    }


}
