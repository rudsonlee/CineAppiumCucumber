package com.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(        //configurações do cucumber
        plugin = {"json:target/reports/cucumberTestes.json", "html:target/reports/"}, //os plugins no reports
        features = "src/test/resources/features", //onde estão os cenarios
        tags = {"@test"},
        glue = {"com.test"}
)

public class RunTest {

@AfterClass
    public static void fecharApp(){ // fechar o app a cada execução
    Hooks.quitDriver();


}

}
