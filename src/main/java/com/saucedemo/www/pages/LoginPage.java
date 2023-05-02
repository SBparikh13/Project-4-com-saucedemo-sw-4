package com.saucedemo.www.pages;

import com.saucedemo.www.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By headingText = By.xpath("//span[@class='title']");
    By usernameField = By.id("user-name");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//input[@id='login-button']");
    By textProduct = By.xpath("//span[contains(text(),'Products')]");
    By totalProduct = By.xpath("//div[@class = 'inventory_item']");

    public String getHeadingText(){
      return getTextFromElement(headingText);
    }
    public void enterUsername(String username){
        sendTextToElement(usernameField,username);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickLoginButton(){
        clickOnElement(loginButton);
    }
    public int countTotalProduct(){
        return countItem(totalProduct);

    }
}
