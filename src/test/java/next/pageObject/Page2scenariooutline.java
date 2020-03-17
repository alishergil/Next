package next.pageObject;

import next.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;
//@Smoke1 steps
public class Page2scenariooutline extends DriverFactory {

    @FindBy(css = "#sli_search_1")
    WebElement Searchbox;
    public void Products(String item){
        Searchbox.sendKeys(item);
    }
    @FindBy(className = "SearchButton")
    WebElement Megnificationglass;
    public void glass(){
        Megnificationglass.click();
    }

    //Assertion for different products pages
    @FindBy(xpath = "/html/body/header/section/div/section[2]/div[1]/ul/li[2]")
    WebElement Mens;
    public void Men() {
        String actual = Mens.getText();
        System.out.println(actual);
        assertTrue(actual.equals("\"men\""));
    }
    @FindBy(xpath = "//*[@id=\"filters\"]/div[1]/div")
    WebElement Womenitems;
    public void Women(){
        String actual1=Womenitems.getText();
        System.out.println(actual1);
        Assert.assertThat(actual1, Matchers.equalTo("19397 Products"));
    }
    @FindBy(xpath = "//*[@id=\"filters\"]/div[1]/div")
    WebElement Girlsitem;
    public void Girls(){
        String actual2=Girlsitem.getText();
        System.out.println(actual2);
        assertTrue(actual2.contains("19397"));
    }
}
