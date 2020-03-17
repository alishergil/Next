package next.stepdefinition;

import next.pageObject.Page3assertion;
import cucumber.api.java.en.When;

//@Sanity1 steps
public class Stepassertion {

    Page3assertion page3=new Page3assertion();


    @When("^User is on Nike UK website and enter Home in search box$")
    public void user_is_on_Nike_UK_website_and_enter_Home_in_search_box() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
     page3.Products();
    }

    @When("^User click on Megnificate glass$")
    public void user_click_on_Megnificate_glass() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    page3.glass();
    }

    @When("^User do the Assertion on below (\\d+) star products$")
    public void user_do_the_Assertion_on_below_star_products(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    page3.selectstarproducts();
    }
}
