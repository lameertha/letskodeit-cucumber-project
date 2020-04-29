package com.learn.letskodeit.pages;

import com.cucumber.listener.Reporter;
import com.learn.letskodeit.Utility.Utility;
import org.apache.http.util.Asserts;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/* Created
 * by Lamee*/
public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//a[@id='header-sign-up-btn']")
    WebElement _signUp;
    @FindBy(xpath = "//input[@id='user_name']")
    WebElement _fullName;
    @FindBy(xpath = "//input[@id='user_email']")
    WebElement _emailAddress;
    @FindBy(xpath = "//input[@id='user_password']")
    WebElement _password;
    @FindBy(xpath = "//input[@id='user_password_confirmation']")
    WebElement _confirmPassword;
    @FindBy(xpath = "//input[@id='user_agreed_to_terms']")
    WebElement _clickTerms;
    @FindBy(xpath = "//input[@name='commit']")
    WebElement _signUpBtn;



    public void setSignUp() {
     Reporter.addStepLog("set to edit profile :"+_signUp.toString());
     clickOnElement(_signUp);
     log.info("set to edit profile :"+_signUp.toString());
    }

    public void setFullName(String name) {
    Reporter.addStepLog("enter the full name :"+name+"to full name field :"+_fullName.toString());
    sendTextToElement(_fullName,name);
    log.info("enter the full name :"+name+"to full name field :"+_fullName.toString());
    }

    public void setEmailAddress(String email) {
     Reporter.addStepLog("enter the email address :"+email+"to email field :"+_emailAddress.toString());
     sendTextToElement(_emailAddress,email);
     log.info("enter the email address :"+email+"to email field :"+_emailAddress.toString());
    }

    public void setPassword(String password) {
     Reporter.addStepLog("enter the password :"+password+"to password filed :"+_password.toString());
     sendTextToElement(_password,password);
     log.info("enter the password :"+password+"to password filed :"+_password.toString());
    }
    public void setConfirmPassword(String confirmPassword){
        Reporter.addStepLog("enter the confirm password :"+confirmPassword+"to confirm password field:"+_confirmPassword.toString());
        sendTextToElement(_confirmPassword,confirmPassword);
        log.info("enter the confirm password :"+confirmPassword+"to confirm password field:"+_confirmPassword.toString());
    }

    public void setClickTerms() {
        Reporter.addStepLog("click on notify button :"+_clickTerms.toString());
        clickOnElement(_clickTerms);
        log.info("click on notify button :"+_clickTerms.toString());
    }

    public void setSignUpBtn() {
     Reporter.addStepLog("click on save changes:"+_signUpBtn.toString());
     clickOnElement(_signUpBtn);
     log.info("click on save changes:"+_signUpBtn.toString());
    }
    public void editToApplication(String name,String email, String password,String confirmPassword) {
        setSignUp();
        setFullName(name);
        setEmailAddress(email);
        setPassword(password);
        setConfirmPassword(confirmPassword);
        setClickTerms();
        setSignUpBtn();
    }
}



