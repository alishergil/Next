package next.pageObject;

import next.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
//@Smoke steps
public class Pageregister extends DriverFactory {

public String HomepageURL(){
    return driver.getCurrentUrl();
}

@FindBy(id = "dk_container_countrySelectorDropdown")
WebElement Popup;
@FindBy(xpath = "//*[@id=\"dk_container_countrySelectorDropdown\"]/div/ul/li[71]/a")
WebElement Country;
@FindBy(id = "btnFlagSelectorShopNow")
WebElement Shopnowbutton;
public void selection(){
    Popup.click();
    Country.click();
    Shopnowbutton.click();
}

@FindBy(xpath = "/html/body/header/div/section/section[2]/ul/li[1]/a")
WebElement Myaccount;
public void Account(){
    Myaccount.click();
}

@FindBy(xpath = "//*[@id=\"sec\"]/div/a/span")
WebElement Registernow;
public void Register(){
    Registernow.click();
}

@FindBy(css = "#Title")
WebElement Title;
@FindBy(css = "#FirstName")
WebElement Firstname;
@FindBy(id = "LastName")
WebElement Lastname;
@FindBy(id = "Email")
WebElement Email;
@FindBy(id = "Password")
WebElement Password;

public void Detail(){
    Select SEL=new Select(Title);
    SEL.selectByValue("Mr");
    Firstname.sendKeys("Sandipkumar");
    Lastname.sendKeys("Patel");
    Email.sendKeys("narayanswarupbaps@yahoo.co.uk");
    Password.sendKeys("Swamibapa1!");
}

@FindBy(css = "#DobDate")
WebElement Dob;
@FindBy(id = "PhoneNumber")
WebElement Phonenumber;
@FindBy(id = "HouseNumberOrName")
WebElement Housenumber;
@FindBy(id = "Postcode")
WebElement Postcode;

public void Detail1(){
    Dob.sendKeys("07/11/81");
    Phonenumber.sendKeys("07894209715");
    Housenumber.sendKeys("85,Rosebank Avenue");
    Postcode.sendKeys("HA0 2TN");
}

@FindBy(id = "SearchPostcode")
WebElement Searchaddress;

public void address(){
    Searchaddress.click();
}
@FindBy(xpath = "//*[@id=\"directory-styles\"]/div/div/div[1]/div/fieldset/div/label[2]")
WebElement SelectNo;

public void Nomarketing(){
    SelectNo.click();
}
@FindBy(id = "ChkByEmail")
WebElement Emailtick;
@FindBy(css = "#ChkBySale")
WebElement Saleemail;

public void Email(){
    Emailtick.click();
    Saleemail.click();
}

}
