/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pageObject;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class signIn 
{
    public WebDriver driver;
    
    @FindBy(how=How.XPATH, using="//input[@name='username']")
    public WebElement username;
    @FindBy(how=How.XPATH, using="//input[@name='password']")
    public WebElement password;
    @FindBy(how=How.XPATH, using="//button[@type='submit']")
    public WebElement submit_button;
    @FindBy(how=How.XPATH, using="//span[@id='react-root']//h1")
    public WebElement text_confirm;
    @FindBy(how=How.XPATH, using ="//a[@class='_3m3RQ _7XMpj']")
    public WebElement dismiss_popup;
    @FindBy(how=How.XPATH, using="//span[@id='react-root']//a[@class='Szr5J kIKUG coreSpriteDesktopNavProfile']")
    public WebElement home_button;
    @FindBy(how=How.XPATH, using="//div[@class='mt3GC']//button[2]")
    public WebElement notification_dismiss;
    
    
   
    
   
    public void enter_username(String str)
    {
        username.sendKeys(str);
    }
    
    public void enter_password(String str)
    {
        password.sendKeys(str);
    }
 
    public void submit()
    {
        submit_button.click();
    }
    
    public void dismiss_popup()
    {
        dismiss_popup.click();
    }
    public void notification_dismiss()
    {
        notification_dismiss.click();
    }
    
    public void home_button()
    {
        home_button.click();
    }
    
    
    public WebElement text()
    {
        return text_confirm;
    }




}
    