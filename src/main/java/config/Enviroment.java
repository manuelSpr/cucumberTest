package config;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import static common.Data.URL;

public class Enviroment extends BaseUtil {

    public BaseUtil base;

    public Enviroment(BaseUtil base){this.base = base;}

    @Before
    public void setEnvironment(){
        String url = URL;
        WebDriverManager.chromedriver().browserVersion("89.0.4389.90").setup();
        base.driver = new ChromeDriver();
        //driver.get(url);
    }

}
