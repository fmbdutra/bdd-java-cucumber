package cucumber.teste;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:/cucumber-learn/src/test/resources/caracteristicas", tags = "@ContaTeste", glue = "cucumber.teste.passos", monochrome = true, dryRun = false)

public class ContaTeste {
}
