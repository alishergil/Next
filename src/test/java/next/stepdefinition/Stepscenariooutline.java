package next.stepdefinition;

import next.pageObject.Page2scenariooutline;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//@Smoke1 steps
public class Stepscenariooutline {

    Page2scenariooutline page2=new Page2scenariooutline();


    @When("^User is on Next website and search for different \"([^\"]*)\"$")
    public void user_is_on_Next_website_and_search_for_different(String item) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       page2.Products(item);
    }

    @When("^User click on Magnificate glass$")
    public void user_click_on_Magnificate_glass() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      page2.glass();
    }

    @Then("^User can see the respective way of results$")
    public void user_can_see_the_respective_way_of_results() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    page2.Men();
    page2.Women();
    page2.Girls();
    }
}
