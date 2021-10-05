package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

    public class SearchResultsPage extends BasePage{

    @FindBy(xpath = "//div[@class='product-card__content']/a[contains(@href,'mi-smart-band-4')]")
    private WebElement smartBandButton;
    @FindBy(xpath = "//div[@class='product-card__content']/a[contains(@href,'mi-smart-band-5')]")
    private WebElement smartAnotherBandButton;
    @FindBy(xpath = "//button[@class='compare-button compare-list__buttons-compare']")
    private WebElement compareButton;
    @FindBy(xpath = "//div[@class='compare-item']")
    private List<WebElement> itemsToComparelist;

    public SearchResultsPage(WebDriver driver){
        super(driver);
    }

    public void clickSmartBand(){
        smartBandButton.click();
    }

    public void clickAnotherSmartBand(){
        smartAnotherBandButton.click();
    }

    public WebElement getCompareButtonVisible() {
        return compareButton;
    }

    public int getItemsToCompareList(){
        List<WebElement> elementList = itemsToComparelist;
        int actualElementsSize = elementList.size();
        return actualElementsSize;
    }
}



