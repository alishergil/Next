package next.pageObject;

import next.DriverFactory;
import next.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.lang.reflect.InvocationTargetException;

//@Sanity steps
public class Page1riverisland extends DriverFactory {

@FindBy(css = "#sli_search_1")
WebElement Searchbox;
@FindBy(xpath = "//*[@id=\"newsearch\"]/input[4]")
WebElement Glass;
@FindBy(xpath = "//*[@id=\"brand\"]/div[1]/p")
WebElement Selectbrand;
@FindBy(xpath = "//*[@id=\"brand\"]/div[2]/ul/li[4]/div/label")
WebElement Riverisland;
public void Brands() throws InterruptedException {
    Searchbox.sendKeys("BRANDS");
    Glass.click();
    Thread.sleep(3000);
    Selectbrand.click();
    Riverisland.click();
}
@FindBy(xpath = "//*[@id=\"i4\"]/section/div[1]/h2/a/span")
WebElement Women;
public void Womens(){
     Women.click();
    }

@FindBy(id ="dk_container_Size-952-956")
WebElement Dropdown;
@FindBy(xpath = "//*[@id=\"dk_container_Size-952-956\"]/div/ul/li[4]/a")
WebElement Medium;
@FindBy(xpath = "//*[@id=\"Style349544\"]/section/div[4]/div[5]/div/a[1]")
WebElement Addtobagproduct;
public void Size(){
    Dropdown.click();
    Medium.click();
    Addtobagproduct.click();
}
@FindBy(xpath = "/html/body/header/div/section/section[1]/a/div[1]")
WebElement MyBag;
@FindBy(xpath = "/html/body/header/div/section/div[4]/div[3]/a[1]")
WebElement ViewAddbag;
public void Bagdetail(){
    MyBag.click();
    ViewAddbag.click();
}
@FindBy(css = ".Hide.DeleteButton.showText")
WebElement Remove;
public void Removeitem(){
    Remove.click();
}
@FindBy(xpath = "//*[@id=\"title\"]/p")
WebElement Assertion;
public void doassertion(){
    String actual=Assertion.getText();
    System.out.println(actual);
    Assert.assertThat(actual, Matchers.equalTo("Your bag contains 0 item and comes to a total of £0.00."));

}
}
