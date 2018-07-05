package cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/cucumber/features",
        glue = "",
//        tags = "@all",
//        dryRun = false,
//        strict = false,
//        snippets = SnippetType.UNDERSCORE,
//        format = {"pretty", "html:target/cucumberReport"}
        format = {"pretty", "json:target/cucumber.json", "html:target/cucumberReport"}
//        name = "^Успешное|Успешная.*"
)

public class RunnerTest {
}
