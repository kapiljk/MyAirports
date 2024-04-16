package TestRunner.com;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import Report.com.Reports;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

/**
 * 
 * @author KapilPalepu
 * @see maintain to run all the test cases and scenarios throw test runner class
 *
 */

@RunWith(Cucumber.class)

@CucumberOptions(
		//snippets= SnippetType.CAMELCASE , dryRun=false,stepNotifications=true, monochrome=true, 
		
		features={"src\\test\\java\\CucumberOptions"}, 
		plugin= {"pretty","json:target\\index.json"}, 
		glue= {"stepDefinitions"}
		)


public class RunnerClass {
	/**
	 * @see used to maintain the report in json format
	 
	@AfterClass
	public static void afterClass() {
		Reports.generateReport("C:\\Users\\Mind-Graph\\eclipse-workspace\\MyAirports\\target\\index.json");
	}
	*/
}
