package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchSteps {

    @Given("User is on the Amazon homepage")
    public void user_is_on_the_amazon_homepage() {
   	System.out.println("Step 1: User on Amazmon homepage");
    }
    
    @And("Amazon searchbox is displayed")
    public void amazon_search_box_is_displayed() {
    	System.out.println("Step 2: User on Amazmon homepage");
      
    }

    @When("User search for product {string}")
    public void user_searches_for_product(String productName) {
    	System.out.println("Step 3: User search for product "+productName);
      
    }

    @Then("Product with name {string} should be displayed")
    public void product_with_name_should_be_displayed(String expectedProduct) {
        System.out.println("Step :4 Product with name should be displayed as "	+expectedProduct);

    }
}
