package steps.runnerClass;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import stepsOf.FlightsSteps;

@RunWith(SerenityRunner.class)
public class FlightTest {

    @Steps
    FlightsSteps stps;

    @Managed
    WebDriver driver;
    @Title("login and booking tickets sucessfully and logout")
    @Test
    public void validating() throws InterruptedException {

        stps.openurl();
        stps.enter_username();
        stps.enterpwd();
        stps.submit();
        /*stps.clickingbtn();
        stps.addblocking();
        Thread.sleep(4000);
        stps.radiobtn();
        stps.drop1();
        stps.drop2();
        stps.drop3();
        stps.drop4();
        stps.drop5();
        stps.drop6();
        stps.drop7();
        stps.clickingbtn1();
        stps.dropdown();
        stps.continuebutton();
*/

    }
}
