package serenityswag.authentication;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SerenityRunner.class)
public class WhenLoggingOnNegative extends UIInteractionSteps {

    @Managed
    WebDriver driver;

    @Test
    public void userUnableToLoginWithInvalidCreds(){
        //driver.get("https://www.saucedemo.com/");
        openUrl("https://www.saucedemo.com/");

        //Login as a standard user with invalid credentials
        /*driver.findElement(By.cssSelector("[data-test='username']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("[data-test='password']")).sendKeys("secret_sauce_1");
        driver.findElement(By.cssSelector("[data-test='login-button']")).click();*/

        //find and $ will do the same job
        find("[data-test='username']").sendKeys("standard_user");
        $("[data-test='password']").sendKeys("secret_sauce_1");
        find("[data-test='login-button']").click();


        // should see error message
        assertThat(find("[data-test='error']").isDisplayed());
    }
}
