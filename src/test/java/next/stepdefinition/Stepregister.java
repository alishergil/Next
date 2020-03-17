package next.stepdefinition;

import next.pageObject.Pageregister;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;
//@Smoke steps
public class Stepregister {

    Pageregister page=new Pageregister();

    @Given("^User is Next website Home page and small select country pop will$")
    public void user_is_Next_website_Home_page_and_small_select_country_pop_will() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    String actual=page.HomepageURL();
    assertTrue(actual.contains("co.uk/"));
    }

    @When("^User will select country and click on Shop now button$")
    public void user_will_select_country_and_click_on_Shop_now_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
   page.selection();
    }

    @When("^User will be UK Next website and click on My Account button$")
    public void user_will_be_UK_Next_website_and_click_on_My_Account_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
   page.Account();
    }

    @When("^User will click on Register Now button$")
    public void user_will_click_on_Register_Now_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
   page.Register();
    }

    @When("^User select Title,First name,Last name,Email and Password fields$")
    public void user_select_Title_First_name_Last_name_Email_and_Password_fields() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
   page.Detail();
    }

    @When("^User Enter DOB,Phone number,House number and Postcode$")public void user_Enter_DOB_Phone_number_House_number_and_Postcode() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
   page.Detail1();
    }
    @When("^User will click on Search button and select the address$")
    public void user_will_click_on_Search_button_and_select_the_address() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
   page.address();
    }

    @When("^User select No button for Next free Directory$")
    public void user_select_No_buttton_for_Next_free_Directory() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
   page.Nomarketing();
    }

    @When("^User select Email box for Marketing information from Next and then click on Sales Email$")
    public void user_select_Email_box_for_Marketing_information_from_Next_and_then_click_on_Sales_Email() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
   page.Email();
    }

    @When("^User click on Register My Account button and account will create$")
    public void user_click_on_Register_My_Account_button_and_account_will_create() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^User can see the respective result$")
    public void user_can_see_the_respective_result() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }


}
