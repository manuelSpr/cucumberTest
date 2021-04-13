package pageObjects;

import common.SysUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultPage {

    WebDriver driver;
    public ResultPage(WebDriver driver){ this.driver = driver;}

    By btnAll = By.className("MUFPAc");
    By lblResults = By.xpath("//*[@class='LC20lb DKV0Md']");

    public void waitPageLoad(){
        SysUtil util = new SysUtil();
        util.waitElement(this.driver, btnAll);
    }

    public List<WebElement> getAllResults(){
        List<WebElement> list = this.driver.findElements(lblResults);
        return list;
    }

    public void scrollToElement(){
        WebElement element = this.driver.findElement(lblResults);
        ((JavascriptExecutor) this.driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void selectElement(String element){
        int index = Integer.parseInt(element);
        List<WebElement> list = getAllResults();
        if(index != 0){
            for(int i=0; i < list.size(); i++){
                if(i == index){
                    driver.findElement(By.xpath("//*[@id='rso']/div[3]/div["+ index +"]/div/div[1]/a/h3")).click();
                }
            }
        }

    }

}
