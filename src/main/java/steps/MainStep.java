package steps;

import config.BaseUtil;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.MainPage;
import pageObjects.ResultPage;
import static common.Data.URL;
public class MainStep extends BaseUtil {

    private BaseUtil env;
    public MainStep(BaseUtil env){this.env = env;}

    @Given("Starting in the initial page on Google")
        public void initialPage(){
            try{
                env.driver.get(URL);

                MainPage mainPage = new MainPage(env.driver);
                mainPage.waitPageLoad();
            }
            catch (PendingException pe){

            }
    }

    @When("Set search of {string}")
        public void searchOfProduct(String element){
        try{
            MainPage mainPage = new MainPage(env.driver);
            mainPage.setShared(element);
            //mainPage.clickOut();
            //mainPage.goShearch();
        }
        catch (PendingException pe){

        }
    }

    @Then("Select second {string} element")
        public void selectProduct(String element){
        try{
            ResultPage resultPage = new ResultPage(env.driver);
            resultPage.waitPageLoad();
            resultPage.scrollToElement();
            resultPage.selectElement(element);
        }
        catch (PendingException pe){

        }
    }

}
