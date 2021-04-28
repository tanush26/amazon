package org.mavan.amazon.utils;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.mavan.amazon.driverfactory.DriverFactory;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();

    @Before
    public void setUp() {
        driverFactory.openBrowser("firefox");
        driverFactory.getUrl("https://www.amazon.co.uk/");
        driverFactory.maximize();
        driverFactory.timeOut();
    }

    @After
    public void tearDown() {
        //    driver.close();
    }
}
