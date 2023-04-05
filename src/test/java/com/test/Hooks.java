package com.test;

import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {


    private static AppiumDriver<?> driver;
    public static AppiumDriver<?> validateDriver() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "J:\\Automação\\Projetos\\AppiumCineCucumber\\apps\\Cinepix.apk");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("platformName", "Android");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        return driver;
    }
    public static AppiumDriver<?> getDriver(){ // retornando o driver
        return driver;
    }

    public static void quitDriver() { //metodo fechar
        if(driver != null) {
            driver.quit();
        }
    }
    @Before
    public static void iniciarProjeto() throws MalformedURLException {
        if (getDriver() != null){
            getDriver().launchApp();
        } else {
            validateDriver();
        }
    }


}
