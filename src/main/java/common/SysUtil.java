package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static common.Data.WAIT_TIME;

public class SysUtil {

    /**
     * A general method to wait see any element
     * @param driver
     * @param element
     */
    public void waitElement(WebDriver driver, By element){
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIME);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

}
