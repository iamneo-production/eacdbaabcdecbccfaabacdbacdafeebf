package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        // /home/coder/project/workspace/src/test/java/Feature/Feature.feature
        features = "src/test/java/Feature/Feature.feature",
        glue = "StepDefination"
)
public class TestRunner {

}
