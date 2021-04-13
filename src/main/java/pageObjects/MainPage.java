package pageObjects;
import common.SysUtil;
import config.Enviroment;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    WebDriver driver;
    By imgInitial = By.className("lnXdpd");
    By txtShared = By.xpath("//input[@name='q']");
    By btnSearch = By.xpath("//input[@value='Google Search']");

    public MainPage(WebDriver driver){
        this.driver = driver;
        //PageFactory.initElements(driver, this);
    }

    public void waitPageLoad(){
        SysUtil util = new SysUtil();
        util.waitElement(this.driver, imgInitial);
    }

    public void setShared(String value){
        this.driver.findElement(txtShared).sendKeys(value, Keys.ENTER);
    }

    public void clickOut(){ this.driver.findElement(imgInitial).click(); }

    public void goShearch(){
        this.driver.findElement(btnSearch).click();
    }

}
