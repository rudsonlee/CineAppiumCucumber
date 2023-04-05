package com.test.screen;

import com.test.Hooks;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BaseScreen { //classe que puxa todos os elementos e passa pro driver

    public BaseScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(Hooks.getDriver()), this); //vai iniciar todos os drivers do appium


    }
}
