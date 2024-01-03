package com.banistmo.www.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com.bainistmo.www.features/prohibicionesPDF.feature",
        glue = "com.banistmo.www.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class ProhibicionesPdfRunner {
}
