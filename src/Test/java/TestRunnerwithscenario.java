package Test.java;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/outline/resources")  // we can also specify multiple features with {} 
public class TestRunnerwithscenario {

}