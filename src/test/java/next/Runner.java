package next;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src\\test\\Resources\\Next.feature",tags = "@Sanity1"
    )
    public class Runner{

    }


