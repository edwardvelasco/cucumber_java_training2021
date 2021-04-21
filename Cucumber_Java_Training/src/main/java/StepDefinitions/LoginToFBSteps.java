package StepDefinitions;

import Mapping.CommonButtons;
//import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LoginToFBSteps {
    WebDriver driver;

    @Given("^user is on Facebook login page$")
    public void user_is_on_Facebook_login_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver","d:\\chromedriver.exe");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        driver = new ChromeDriver(ops);
        //driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        driver.get("http://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        final String PAGETITLE = "Facebook – log in or sign up";
        Assert.assertEquals(PAGETITLE,pageTitle);
    }

    @When("^user enters username and password$")
    public void user_enters_username_and_password() throws Throwable {
        Thread.sleep(5000);
        driver.findElement(By.name("email")).sendKeys("edward.velasco.ph+Matt@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Matt_1234");
        Thread.sleep(5000);
        File shot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(shot, new File("D:\\Screenshots\\LoginPage.jpg"));
    }

    @When("^user clicks login button$")
    public void user_clicks_login_button() throws Throwable {
//        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath(CommonButtons.LOGINBTN)).click();


        Thread.sleep(5000);
        if (driver.getPageSource().contains("The password that you've entered is incorrect.")){
            System.out.println("Invalid credentials");
            Assert.fail("Password : ******* ");
        }
        else {
            System.out.println("Connected with Facebook successfully.");
        }
    }

    @Then("^user validate welcome message$")
    public void user_validate_welcome_message() throws Throwable {
        Thread.sleep(5000);
        driver.getPageSource().contains("What's on your mind, Matt Edward?");
        File shot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(shot, new File("D:\\Screenshots\\FacebookWall.jpg"));
        //What's on your mind, Matt Edward?
        //Welcome to Facebook
    }

    @Then("^user logout to FB$")
    public void user_logout_to_FB() throws Throwable{
        Thread.sleep(5000);
        WebElement logoutDropdown = driver.findElement(By.cssSelector(CommonButtons.LOGOUTBTN));
        logoutDropdown.click();
        driver.findElement(By.xpath("//span[text()='Log Out']")).click();
        if (driver.getPageSource().contains("What's on your mind, Matt Edward?")){
            System.out.println("User still in Facebook Page");
            Assert.fail("Please Logout to properly close session");
        }
        else {
            System.out.println("Signed out to Facebook successfully.");

        }
        File shot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(shot, new File("D:\\Screenshots\\LogOutPage.jpg"));
    }
    @Then("^close browser$")
    public void closeBrowser(){
        driver.quit();
    }
        /*
    @After
    public void closeBrowser(){
        driver.quit();
    }
     */
}
