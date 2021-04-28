package org.mavan.amazon.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.mavan.amazon.pageobjects.Homepage;
import static org.hamcrest.MatcherAssert.assertThat;

public class SearchStepDef {
    Homepage homepage = new Homepage();

    @Given("^User visit Amazon main page$")
    public void userVisitAmazonMainPage() {
        String actual = homepage.getUrl();
        assertThat("The HomePage might ends with another URL",actual, Matchers.endsWith(".uk/"));
    }

    @When("^User search for \"([^\"]*)\"$")
    public void userSearchFor(String customerSelectedProduct) throws Throwable {
    homepage.searchItem(customerSelectedProduct);
    }

    @Then("^the search results are displayed$")
    public void theSearchResultsAreDisplayed() {

    }

    @And("^the first result has the word \"([^\"]*)\" in it$")
    public void theFirstResultHasTheWordInIt(String arg0) throws Throwable {
     String actual = homepage.resultWord();
     assertThat("The results page title might be something else",actual,Matchers.equalToIgnoringCase(homepage.resultWord()));
    }
}
