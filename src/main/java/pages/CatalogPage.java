package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends BasePage{

    @FindBy(xpath = "//a[contains(text(),' Фітнес-браслети')]")
    private WebElement watchesButton;

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    public void clickWatches(){
        watchesButton.click();
    }


}
