package NHS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginFunctionality {




        @Test
        public void login(){


            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("http://www.techtorialacademy.link/app");
            driver.manage().window().maximize();









    }





}
