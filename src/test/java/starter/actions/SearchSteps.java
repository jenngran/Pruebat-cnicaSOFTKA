package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.WebElement;
import starter.pageobjects.SearchForm;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class SearchSteps extends UIInteractionSteps {

    SearchForm searchForm;

    @Step
    public void MakeACar() {
        find(SearchForm.user).click();
        find(SearchForm.user).sendKeys("standard_user");
        find(SearchForm.key).click();
        find(SearchForm.key).sendKeys("secret_sauce");
        find(SearchForm.loginbutton).click();
        find(SearchForm.backpack).click();
        find(SearchForm.bike).click();
        find(SearchForm.cart).click();
        find(SearchForm.check).click();
        find(SearchForm.firstname).sendKeys("Jenniffer");
        find(SearchForm.lastname).click();
        find(SearchForm.lastname).sendKeys("Granda");
        find(SearchForm.zipcode).click();
        find(SearchForm.zipcode).sendKeys("1234567");
        find(SearchForm.btncontinue).click();
        find(SearchForm.btnfinish).click();



        withTimeoutOf(Duration.ofSeconds(10));
        waitFor(presenceOfElementLocated(SearchForm.exito));
        WebElement successMessage = find(SearchForm.exito);

        // Realiza la afirmación para verificar que el texto contiene "¡Éxito!"
        assertTrue(successMessage.getText().contains("Thank you for your order!"), "El mensaje de éxito no contiene '¡Éxito!'");


    }

    //@Step("Check the search results")
    //public List<String> getSearchResults() {
        //return findAll(SearchForm.ARTICLE_HEADINGS).texts();
    //}
}
