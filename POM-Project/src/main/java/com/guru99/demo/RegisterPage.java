package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.PropertyFileReader;
import utils.TestApp;

public class RegisterPage {
    WebDriver driver = TestApp.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();
    String firstNameElementValue = prop.getProperty("RegisterPage","first.name.element");
    String lastNameElementValue = prop.getProperty("RegisterPage","last.name.element");
    String phoneNameElementValue = prop.getProperty("RegisterPage","phone.element");
    String emailElementValue = prop.getProperty("RegisterPage","email.element");
    String countryElementValue = prop.getProperty("RegisterPage","country.dropdown.element");
    String userNameElementValue = prop.getProperty("RegisterPage","user.name.element");
    String passwordElementValue = prop.getProperty("RegisterPage","password.element");
    String confirmPasswordElementValue = prop.getProperty("RegisterPage","confirm.password.element");
    String submitButtonElementValue = prop.getProperty("RegisterPage","submit.button.element");
    public  RegisterPage setFirstName(String firstNameValue){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(firstNameElementValue),10);
        WebElement firstNameElement = driver.findElement(By.name(firstNameElementValue));
        firstNameElement.sendKeys(firstNameValue);
        return  this;
    }
    public  RegisterPage setLastName(String lastNameValue){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(lastNameElementValue ),10);
        WebElement lastNameElement = driver.findElement(By.name(lastNameElementValue ));
        lastNameElement.sendKeys(lastNameValue);
        return  this;
    }
    public  RegisterPage setPhoneNumber(String phoneNumberValue){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(phoneNameElementValue),10);
        WebElement phoneNumberElement = driver.findElement(By.name(phoneNameElementValue));
        phoneNumberElement.sendKeys(phoneNumberValue);
        return this;
    }
    public  RegisterPage setemailId(String emailIdValue){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(emailElementValue),10);
        WebElement emailIdElement = driver.findElement(By.id(emailElementValue));
        emailIdElement.sendKeys(emailIdValue);
        return this;
    }
    public  RegisterPage setcountryName(String countryNameValue){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(countryElementValue),10);
        Select countyDropDownElement = new Select(driver.findElement(By.name(countryElementValue)));
        countyDropDownElement.selectByVisibleText(countryNameValue);
        return this;
    }
    public  RegisterPage setuserName(String userNameValue){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(userNameElementValue),10);
        WebElement userNameElement = driver.findElement(By.id(userNameElementValue));
        userNameElement.sendKeys(userNameValue);
        return this;
    }
    public  RegisterPage setpassword(String passwordValue){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(passwordElementValue),10);
        WebElement passwordElement = driver.findElement(By.name(passwordElementValue));
        passwordElement.sendKeys(passwordValue);
        return this;
    }
    public  RegisterPage setConfirmpassword(String confirmPasswordValue){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(confirmPasswordElementValue),10);
        WebElement confirmPasswordElement = driver.findElement(By.name(confirmPasswordElementValue));
        confirmPasswordElement.sendKeys(confirmPasswordValue);
        return this;
    }
    public RegisterSuccessPage clickOnSubmitButton() {
        TestApp.getInstance().waitUntilNextElementAppears(By.name(submitButtonElementValue),10);
        WebElement submitButtonElement = driver.findElement(By.name(submitButtonElementValue));
        submitButtonElement.click();
        return new RegisterSuccessPage();
    }

}
