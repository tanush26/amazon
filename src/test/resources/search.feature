@search
  Feature: Search for product


Scenario: User able to Search for product

Given User visit Amazon main page
When  User search for "iphone"
Then  the search results are displayed
And   the first result has the word "iphone" in it


