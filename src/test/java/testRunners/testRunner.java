package testRunners;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/webtest.feature", 
				  glue= "stepDefinations",tags="@Makemytrip",
				  plugin= {"pretty","html:target/report","json:target/jsonReport.json","junit:target/xmlReport.xml"},
				  monochrome=true,
				  strict=true)

public class testRunner {


	

}
