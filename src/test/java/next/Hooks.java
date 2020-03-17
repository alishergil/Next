package next;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverFactory DRIVER=new DriverFactory();

    @Before
    public void setup(){
        DRIVER.openbro();
    }

    @After
    public void teardown(){
        DRIVER.closebro();
    }
}


