$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("result.feature");
formatter.feature({
  "line": 3,
  "name": "User able to click checkout button and payment page should be displayed",
  "description": "",
  "id": "user-able-to-click-checkout-button-and-payment-page-should-be-displayed",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@result"
    }
  ]
});
formatter.before({
  "duration": 16023746819,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User visit Amazon main page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User search for \"iphone\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the search results are displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the first result has the word \"iphone\" in it",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepDef.userVisitAmazonMainPage()"
});
formatter.result({
  "duration": 197001528,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "iphone",
      "offset": 17
    }
  ],
  "location": "SearchStepDef.userSearchFor(String)"
});
formatter.result({
  "duration": 5353240377,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDef.theSearchResultsAreDisplayed()"
});
formatter.result({
  "duration": 23135,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "iphone",
      "offset": 31
    }
  ],
  "location": "SearchStepDef.theFirstResultHasTheWordInIt(String)"
});
formatter.result({
  "duration": 236463210,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "checkout",
  "description": "",
  "id": "user-able-to-click-checkout-button-and-payment-page-should-be-displayed;checkout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User click Add to Cart the searched item",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User click proceed to checkout button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "payment page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ResultStepDef.userClickAddToCartTheSearchedItem()"
});
formatter.result({
  "duration": 19937380916,
  "status": "passed"
});
formatter.match({
  "location": "ResultStepDef.userClickProceedToCheckoutButton()"
});
formatter.result({
  "duration": 18340236525,
  "status": "passed"
});
formatter.match({
  "location": "ResultStepDef.paymentPageShouldBeDisplayed()"
});
formatter.result({
  "duration": 145616518,
  "status": "passed"
});
formatter.after({
  "duration": 14565,
  "status": "passed"
});
});