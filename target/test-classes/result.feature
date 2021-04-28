@result

Feature: User able to click checkout button and payment page should be displayed

Background:
  Given User visit Amazon main page
  When  User search for "iphone"
  Then  the search results are displayed
  And   the first result has the word "iphone" in it

  Scenario: checkout
Given User click Add to Cart the searched item
When  User click proceed to checkout button
Then  payment page should be displayed


