package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.PropertyFileReader;
import utils.TestApp;

public class HomePage {
    WebDriver driver = TestApp.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();
    String registerMenuElementValue = prop.getProperty("HomePage","register.menu.element");
    public RegisterPage clickOnRegisterMenu() {
        TestApp.getInstance().waitUntilNextElementAppears(By.linkText(registerMenuElementValue), 10);
        WebElement registerMenuElement = driver.findElement(By.linkText(registerMenuElementValue));
        registerMenuElement.click();
        return new RegisterPage();
    }
}
