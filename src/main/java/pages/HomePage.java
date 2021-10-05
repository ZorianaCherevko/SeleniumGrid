package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//div[@class='main-header__categories']")
    private WebElement catalogButton;

    @FindBy(xpath = "//li[@data-id='1516']")
    private WebElement phonesButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickCatalog(){
        catalogButton.click();
    }

    public void isclickPhonesVisible() {
        phonesButton.isDisplayed();
    }

    public void clickPhones(){
        phonesButton.click();
    }









}
