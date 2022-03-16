package tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/test.feature"},
        plugin = {"pretty", "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm", "json:target/cucumber.json"},
        glue = {"tests"},
        tags = "@TESTS"
)


public class RunTests {
}
