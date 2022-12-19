package stepdefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSD {

    WebDriver driver;
    @Given("I am on login Page")
    public void i_am_on_login_page() {
        //System.out.println("I am on login Page");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.amolujagare.com/");
    }
    @When("I enter correct username and password")
    public void i_enter_correct_username_and_password() {
       // System.out.println("I enter correct username and password");

        driver.findElement(By.id("login-username")).sendKeys("admin");
        driver.findElement(By.id("login-password")).sendKeys("admin");

    }
    @When("I click on Login button")
    public void i_click_on_login_button() {
        //System.out.println("I click on Login button");

        driver.findElement(By.name("submit")).click();

    }
    @Then("I should be on home page")
    public void i_should_be_on_home_page() {
        //System.out.println("I should be on home page");

        String expected = "https://stock.amolujagare.com/dashboard.php";
        String actual = driver.getCurrentUrl();

        Assert.assertEquals("This is not a dashboard",expected,actual);

    }
}
