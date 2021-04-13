package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import static common.Data.*;

public class Config {

    public WebDriver setDriver(){
        String url = URL;
        WebDriverManager.chromedriver().browserVersion("89.0.4389.90").setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        return driver;
    }

}
