package instagram_automation_test;


import pageObject.signIn;
import pageObject.edit;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 *
 * @author Daniel Marinho
 */
public class instagram_automation {
    public String baseUrl = "https://www.instagram.com/accounts/login/";
    String driverPath = "C:\\Users\\Daniel Marinho\\Desktop\\Chrome Driver\\chromedriver.exe";
    public WebDriver driver;
    signIn myUser;
    edit userEdit;
   @BeforeClass 
   public void before_class_setUp()
   {
     myUser=PageFactory.initElements(driver,signIn.class);
     userEdit=PageFactory.initElements(driver,edit.class);
   }
  
    @BeforeTest
    public void setUpClass() throws Exception 
    {
       System.out.println("Chrome Browser is launching");
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Daniel Marinho\\Desktop\\Chrome Driver\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.get(baseUrl);
      
    }

    @BeforeMethod 
    public void before_method() throws InterruptedException
    {
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
   
    
   @AfterTest
   public void tearDown()
   {
       
   }
   
   
   @Test(priority=1)
   public void verifyLogin()
   throws InterruptedException{
    myUser.enter_username("radric3");
    myUser.enter_password("moneydey");
    myUser.submit();
    myUser.dismiss_popup();
    myUser.notification_dismiss();
    myUser.home_button();
    Assert.assertEquals(myUser.text().getText(),"radric3");
   }
    
   @Test(priority=2)
   public void verifyEdit()
   throws InterruptedException{
       //clicking edit button from instagram
       userEdit .edit_button();
       userEdit.enter_name("David Eko");
       userEdit.enter_username("O.B.O_majorChairman5");
       userEdit.enter_website("Eko@lagos.com");
       userEdit.enter_bio("Living lavish");
       userEdit.enter_email("OBO3@nigeria.com");
       userEdit.enter_phoneNumber("+2341013245");
       userEdit.gender();
       Thread.sleep(1000);
       userEdit.dismiss_popup();
       userEdit.submit();
       myUser.home_button();
       Thread.sleep(1000);
       userEdit.edit_button();
       Assert.assertEquals(userEdit.name().getAttribute("value"),"David Eko");
       Assert.assertEquals(userEdit.username().getAttribute("value"),("O.B.O_majorChairman5"));
       Assert.assertEquals(userEdit.website().getAttribute("value"),("Eko@lagos.com"));
       Assert.assertEquals(userEdit.bio().getAttribute("value"),("Living lavish"));
       Assert.assertEquals(userEdit.email().getAttribute("value"),("OBO3@nigeria.com"));
       Assert.assertEquals(userEdit.phone_number().getAttribute("value"),("+2341013245"));
   }
}
