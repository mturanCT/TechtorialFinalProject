package NHS.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    public Login(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "inputEmail")
    WebElement username;

    @FindBy(id = "inputPassword")
    WebElement password;

    @FindBy(xpath = "//button[.='Sign in']")
    WebElement LoginButton;


    public void LoginFunction(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        LoginButton.click();


    }
}