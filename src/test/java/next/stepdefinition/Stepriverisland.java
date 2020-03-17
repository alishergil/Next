package next.stepdefinition;

import next.pageObject.Page1riverisland;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//@Sanity steps
public class Stepriverisland {

    Page1riverisland page1=new Page1riverisland();

    @When("^User is on Next website and search for Brands,click on search button and click on brands and select RiverIsland brand box$")
    public void user_is_on_Next_website_and_search_for_Brands_click_on_search_button_and_click_on_brands_and_select_RiverIsland_brand_box() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
   page1.Brands();
    }

    @When("^User select River Island River Island Black Manchester Devoré Bodycon Dress$")
    public void user_select_River_Island_River_Island_Black_Manchester_Devoré_Bodycon_Dress() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    page1.Womens();
    }

    @When("^User Choose Medium Size and click on Add to Bag$")
    public void user_Choose_Medium_Size_and_click_on_Add_to_Bag() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    page1.Size();
    }

    @When("^User click on Bag and click on Edit or view Bag button$")
    public void user_click_on_Bag_and_click_on_Edit_or_view_Bag_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
   page1.Bagdetail();
    }

    @When("^User will click on Remove item from beg$")
    public void user_will_click_on_Remove_item_from_beg() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
   page1.Removeitem();
    }

    @When("^User do assertion on that message that your shopping beg is empty$")
    public void user_do_assertion_on_that_message_that_your_shopping_beg_is_empty() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
   page1.doassertion();
    }

    @Then("^User can see the respective results$")
    public void user_can_see_the_respective_results() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

}
