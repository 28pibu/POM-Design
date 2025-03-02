package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.TestApp;

public class RegisterSuccessPage {
    WebDriver driver = TestApp.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();
    String SalutationMessageElementValue = prop.getProperty("RegisterSuccessPage","salutation.Message.element");
    public  String getSalutationMessage() {
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(SalutationMessageElementValue),15);
        String actualMessage = driver.findElement(By.xpath(SalutationMessageElementValue)).getText();
        return actualMessage;
    }
}
