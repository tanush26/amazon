package org.mavan.amazon.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.mavan.amazon.pageobjects.ResultPage;

import static org.hamcrest.MatcherAssert.assertThat;


public class ResultStepDef {
ResultPage resultPage = new ResultPage();

    @Given("^User click Add to Cart the searched item$")
    public void userClickAddToCartTheSearchedItem() throws InterruptedException {
        resultPage.products();
        resultPage.basket();
    }

    @When("^User click proceed to checkout button$")
    public void userClickProceedToCheckoutButton() throws InterruptedException {
        resultPage.checkOut();
        resultPage.credentials();
    }

    @Then("^payment page should be displayed$")
    public void paymentPageShouldBeDisplayed() {
       String actual1 = resultPage.paymentPage();
        assertThat("ThePayment Page might have other name",actual1,Matchers.equalToIgnoringCase(resultPage.paymentPage()));
    }




}
