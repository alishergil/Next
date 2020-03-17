Feature: Registration
  As a uSER
  I want to see the Next website
  So that i can register myself

  Background:
    Given User is Next website Home page and small select country pop will
    When  User will select country and click on Shop now button

  @Smoke
  Scenario: Membership Registration in UK Next website
    And   User will be UK Next website and click on My Account button
    And   User will click on Register Now button
    And   User select Title,First name,Last name,Email and Password fields
    And   User Enter DOB,Phone number,House number and Postcode
    And   User will click on Search button and select the address
    And   User select No button for Next free Directory
    And   User select Email box for Marketing information from Next and then click on Sales Email
    And   User click on Register My Account button and account will create
    Then  User can see the respective result

  @Sanity
  Scenario: User want to buy a River island brand Jacket in Next website UK
    And   User is on Next website and search for Brands,click on search button and click on brands and select RiverIsland brand box
    And   User select River Island River Island Black Manchester Devoré Bodycon Dress
    And   User Choose Medium Size and click on Add to Bag
    And   User click on Bag and click on Edit or view Bag button
    And   User will click on Remove item from beg
    And   User do assertion on that message that your shopping beg is empty
    Then  User can see the respective results

  @Smoke1
  Scenario Outline: Search for different products in Next website
    And  User is on Next website and search for different "<Products>"
    And  User click on Magnificate glass
    Then User can see the respective way of results
    Examples:
      |Products|
      |Men     |
      |Women   |
      |Girls   |

  @Sanity1
  Scenario: User want to do Assertion on Home search like How many items are below 5 star
    And  User is on Nike UK website and enter Home in search box
    And  User click on Megnificate glass
    And  User do the Assertion on below 5 star products
    Then User can see the respective result

