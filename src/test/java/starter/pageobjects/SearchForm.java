package starter.pageobjects;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class SearchForm extends PageObject {
    public static final By user = By.id("user-name");
    public static final By loginbutton = By.id("login-button");
    public static final By key = By.xpath("//div[@class='login-box']//input[@id='password']");
    public static final By backpack = By.id("add-to-cart-sauce-labs-backpack");
    public static final By bike = By.id("add-to-cart-sauce-labs-bike-light");
    public static final By check = By.id("checkout");
    public static final By firstname = By.id("first-name");
    public static final By lastname = By.id("last-name");
    public static final By zipcode = By.id("postal-code");
    public static final By btncontinue = By.id("continue");
    public static final By cart = By.id("shopping_cart_container");
    public static final By btnfinish = By.id("finish");

    public static final By exito = By.xpath("//*[contains(text(), 'Thank you for your order!')]");






}
