package uk.ac.cam.ice;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import uk.ac.cam.ice.propertyreader.PropertyReader;
import uk.ac.cam.ice.utility.Utility;

import java.io.IOException;

public class Hooks extends Utility{ //Inheritance opps concept by extending Utility

    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));//get browser from property reader
    }

    @After
    public void tearDown(Scenario scenario) { //take screenshot
        if (scenario.isFailed()) {
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        closeBrowser();
    }
}
