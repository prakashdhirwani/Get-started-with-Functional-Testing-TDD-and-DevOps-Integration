package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"features"},
                          glue={"steps"},
                          plugin={"pretty","html:target/Testing_Report.html"},
                          tags="@tag1",
                          monochrome= true,
                          dryRun= false
)

public class TestRunner
{

}
