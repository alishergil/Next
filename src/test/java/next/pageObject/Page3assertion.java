package next.pageObject;

import next.DriverFactory;
import next.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
//@SANITY1 STEPS

public class Page3assertion extends DriverFactory {

    @FindBy(css = "#sli_search_1")
    WebElement Searchbox;
    public void Products(){

        Searchbox.sendKeys("Home");
    }

    @FindBy(className = "SearchButton")
    WebElement Megnificationglass;
    public void glass(){

        Megnificationglass.click();
    }

    @FindBy(className = ".Rating.rating-45")
    List<WebElement> Stars;
    public void selectstarproducts(){
        for(WebElement Star:Stars){
          String Products=Star.getAttribute("href");
          System.out.println(Products);
        }
    }


}
