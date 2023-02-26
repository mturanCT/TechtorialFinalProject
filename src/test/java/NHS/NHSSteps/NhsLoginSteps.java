package NHS.NHSSteps;

import NHS.pages.LoginPage;
import Utils.ConfigReader;
import Utils.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class NhsLoginSteps {
   WebDriver driver= new ChromeDriver();
   LoginPage loginPage = new LoginPage(driver);




    @Given("the user navigates to {string}")
    public void the_user_navigates_to(String string) {
        // Write code here that turns the phrase above into concrete actions
        driver.navigate().to(ConfigReader.readProperty("url"));
    }

    @When("the user provides {string} and {string}")
    public void the_user_provides_and(String string, String string2) {
            // Write code here that turns the phrase above into concrete actions
            loginPage.LoginFunction(ConfigReader.readProperty("username"), ConfigReader.readProperty("password"));


        }
    @Then("user validates he is on the same page")
    public void user_validates_he_is_on_the_same_page() {
            // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(driver.getTitle(),"http://www.techtorialacademy.link/");
        }



        }
//    @Test
//
//
//    public void errorMessage() {
//
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("http://www.techtorialacademy.link");
//        WebElement username = driver.findElement(By.name("username"));
//        WebElement bootStrap = driver.findElement(By.xpath("//link[@href=\"/css/stylelogin.css\"]"));
//        String actual  =bootStrap.getText().toString();
//        String expected = "Please fill out this field";
//        Assert.assertEquals(expected, actual);
//
//
//
//    }


