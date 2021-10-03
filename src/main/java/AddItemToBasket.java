import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AddItemToBasket {
    WebDriver driver;

    @Given("I am on Home Page {string}")
    public void openhomepage(String url)
    {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get(url);
    }

    @When("I enter an item in the search bar {string}")
    public void searchAnItem(String searchtext){
        driver.findElement(By.id("sli_search_1")).sendKeys(searchtext);

    }
    @When("I click on search button")
public void clickSearchButton(){
        driver.findElement(By.className("SearchButton")).click();

}
@Then("Jeans of all the brands are displayed")
public void displayJeansVerification(){

}
@When("I click on one of the items {string}")
public void clickOnItem(String itemname ){
    driver.findElement(By.xpath("//a[@title=\"Mid Blue Slim Jeans (417188) | £24\"]")).click();
}
@And("I select a size {string}")
public void selectasize(String size) {
    Select sizeSelect = new Select(driver.findElement(By.id("Size-417-188")));
    sizeSelect.selectByVisibleText(size);
}
@When(" I click on Add to basket")
public void addToBasket(){
    driver.findElement(By.className("btn-addtobag")).click();
}
@And("I click on edit basket button")
public void editBasket(){
    driver.findElement(By.className("view_edit_bag")).click();
}
@And("I select a quantity {string}")
public void selectQuantity(String qty){
    Select quantity = new Select(driver.findElement(By.id("Qty_1")));
    quantity.selectByVisibleText(qty);
}
@Then("Item is updated in the bag")
public void validateItemUpdate(){

}

}
