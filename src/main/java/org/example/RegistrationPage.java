package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage extends Utils {

        By _firstNamefield = By.id("FirstName");
        By _lastNamefiled = By.id("LastName");
        By _emailField = By.id("Email");
        By _passwordField = By.id("Password");
        By _confirmPasswordField = By.id("ConfirmPassword");
        By _clickOnRegisterButton = By.id("register-button");
        String email01 =loadProp.getProperty("email01")+currentTimeStamp()+loadProp.getProperty("email02");


    public void verifyUserIsOnRegisterPage() {

            Assert.assertTrue(driver.getCurrentUrl().contains("register"));

        }


      public void userEntersRegistrationDetails(){

            typeText(_firstNamefield, loadProp.getProperty("firstName"));// add value
            typeText(_lastNamefiled, loadProp.getProperty("LastName"));// type last name
            Select selectDay = new Select(driver.findElement(By.name("DateOfBirthDay")));// select Day from dropdown
            Select selectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));//select month from dropdown
            selectMonth.selectByValue("4");
            Select selectYear = new Select(driver.findElement(By.name("DateOfBirthYear")));//select year from dropdown
            selectYear.selectByVisibleText("2000");
            String email =loadProp.getProperty("email1")+ currentTimeStamp() + loadProp.getProperty("email2");
            typeText(_emailField, email);

            System.out.println("email: " + email);

            typeText(_passwordField, loadProp.getProperty("password"));// type password
            System.out.println("password: " + loadProp.getProperty("password"));
            typeText(_confirmPasswordField, loadProp.getProperty("confirmpassword"));// confirm password


        }
        public void clickOnRegister1() {
//            waitForClickable(By.name("register-button"), 10);// applied wait time
            clickOnElement(_clickOnRegisterButton);


            }

    }



