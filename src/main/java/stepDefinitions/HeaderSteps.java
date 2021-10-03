package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HeaderSteps extends CommonFunctions {

    @Given("I'm on home Page {string}")
    public void i_m_on_home_page(String url) {
        driver.get(url);

    }
    @When("I click on My Account Link")
    public void i_click_on_account_link() {
        waitForTime(2);
        driver.findElement(By.linkText("My Account")).click();

    }
    @Then("I should get re-directed appropriatley with title {string}")
    public void i_should_get_re_directed_appropriatley_with_title(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));


    }



}
