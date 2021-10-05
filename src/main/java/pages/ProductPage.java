package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//button[@id='product-buy-button']")
    private WebElement addToCartbutton;
    @FindBy(xpath = "//div[@class='cart-popup__body']")
    private WebElement addToCartPopup;
    @FindBy(xpath = "//div[@class='v-modal__close-btn']")
    private WebElement closeCartPopup;
    @FindBy(xpath = "//div[@class='shopping-cart__mobile-click']")
    private WebElement shoppingCartButtton;
    @FindBy(xpath = "//div[@class='title']//*[name()='use' and @*='/_nuxt/8a1f6ba0a661064bb92432bee74b966b.svg#i-close']")
    private WebElement removeButton;
    @FindBy(xpath = "//span[@class='shopping-cart__count']")
    private WebElement amountOfProductsInCart;
    @FindBy(xpath = "//div[@class='p-trade-wrapper__actions p-actions p-actions--no-count']//div[@title='Додати до порівняння']")
    private WebElement addToComparebutton;
    @FindBy(xpath = "//li[@class='breadcrumbs__item']//a[contains(@href,'xiaomi')]")
    private WebElement breadCrumbXiaomi;
    @FindBy(xpath = "//a[contains(text(),'сюди')]")
    private WebElement messageAfterRemovingItem;


    public ProductPage(WebDriver driver){
        super(driver);
    }

    public void clickAddToCartbutton(){
        addToCartbutton.click();
    }

    public WebElement getAddToCartPopup() {
        return addToCartPopup;
    }

    public void clickARemove(){
        removeButton.click();
    }

    public void clickCloseCartPopup(){
        closeCartPopup.click();
    }

    public String getTextOfAmountProductsInCart() {
        return amountOfProductsInCart.getText();
    }

    public void clickAddToComparebutton(){
        addToComparebutton.click();
    }

    public void clickBreadCrumbXiaomi(){
        breadCrumbXiaomi.click();
    }

    public WebElement getMessageAfterRemovingItem() {
        return messageAfterRemovingItem;
    }
}
