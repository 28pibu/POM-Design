package com.guru99.demo;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class RegeisterUserTest4 {
    HomePage homePage;
    RegisterPage registerPage;
    RegisterSuccessPage registerSuccessPage;
    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        homePage = new HomePage();
        registerPage = homePage.clickOnRegisterMenu();
    }
    @Test
    public void testRegisterUser() {
        String firstName = "Pibushan";
        String lastName = "Krishnakumar";
        registerSuccessPage = registerPage
                .setFirstName(firstName)
                .setLastName(lastName)
                .setPhoneNumber("0750305908")
                .setemailId("pibushan28@gmail.com")
                .setcountryName("SRI LANKA")
                .setuserName("Admin")
                .setpassword("admin@123456").setConfirmpassword("admin@123456").clickOnSubmitButton();
        String actualMessage=registerSuccessPage.getSalutationMessage();
        String expectedMessage = "Dear "+firstName+" "+lastName+",";
        Assert.assertEquals(actualMessage,expectedMessage,"Failed to register New User");
    }
}
