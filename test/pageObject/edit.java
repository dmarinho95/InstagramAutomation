/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pageObject;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Daniel Marinho
 */
public class edit {
    
    WebDriver driver;
    
    @FindBy(how=How.XPATH, using= "//button[@type='button']" )
    WebElement edit_button;
    @FindBy(how=How.XPATH, using= "//input[@id='pepName']" )
    WebElement name;
    @FindBy(how=How.XPATH, using= "//input[@id='pepUsername']" )
    WebElement userName;
    @FindBy(how=How.XPATH, using= "//input[@id='pepWebsite']")
    WebElement website;
    @FindBy(how=How.XPATH, using="//textarea[@id='pepBio']")
    WebElement bio;
    @FindBy(how=How.XPATH, using="//input[@id='pepEmail']")
    WebElement email;
    @FindBy(how=How.XPATH, using="//input[@id='pepPhone Number']")
    WebElement phone_number;
    @FindBy(how=How.XPATH, using="//select[@id='pepGender']")
    WebElement gender;
    @FindBy(how=How.XPATH, using="//button[@type='button'][1]")
    WebElement submit_button;
    @FindBy(how=How.XPATH, using="//span[@role='button']")
    WebElement dismiss_popup;
    //returing elements
   public WebElement name()
   {
       return name;
   }
   public WebElement username()
   {
       return userName;
   }
   
   public WebElement website()
   {
       return website;
   }
   
   public WebElement bio()
   {
       return bio;
   }
   public WebElement email()
   {
       return email;
   }
   public WebElement phone_number()
   {
       return phone_number;
   }
   
   public void edit_button()
   {
       edit_button.click();
   }
    
   public void enter_name(String str)
   {
       name.clear();
       name.sendKeys(str);
   }
   
   public void enter_username(String str)
   {
       userName.clear();
       userName.sendKeys(str);
   }
   
   public void enter_website(String str)
   {
       website.sendKeys(str);
   }
   
   public void enter_bio(String str)
   {
       bio.sendKeys(str);
   }

   public void enter_email(String str)
   {
       email.clear();
       email.sendKeys(str);
   }

   public void enter_phoneNumber(String str)
   {
       phone_number.clear();
       phone_number.sendKeys(str);
   }
   
   public void gender()
   {
       Select dropdownbox= new Select(gender);
       dropdownbox.selectByVisibleText("Male");
       
   }

   public void submit()
   {
       submit_button.click();
   }

   public void dismiss_popup()
   {
       dismiss_popup.click();
   }
   
}
