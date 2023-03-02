package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @Before  //it should come form cucumber java NOT JUNIT
    public void setUp() {
        System.out.println("SET UP BEFORE EACH SCENARIO");
    }


    @After  //it should come form cucumber java NOT JUNIT
    public void tearDown(Scenario scenario)  {

      //  if (scenario.isFailed()){
            byte[] data = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data,"image/png", scenario.getName());
        //}


        BrowserUtils.sleep(3);
        Driver.closeDriver();
    }
}
