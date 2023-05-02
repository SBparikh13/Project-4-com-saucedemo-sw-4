package com.saucedemo.www.testsuite;

import com.saucedemo.www.pages.LoginPage;
import com.saucedemo.www.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
@Test
    public void userShouldLoginSuccessfullyWithValid(){
    loginPage.enterUsername("standard_user");
    loginPage.enterPassword("secret_sauce");
    loginPage.clickLoginButton();
    Assert.assertEquals(loginPage.getHeadingText(),"Products","User login is not successfull.");

    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
        Assert.assertEquals(loginPage.countTotalProduct(),6,"Products are not displayed correctly");

    }
}