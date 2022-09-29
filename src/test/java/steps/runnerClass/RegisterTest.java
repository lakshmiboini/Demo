package steps.runnerClass;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import stepsOf.RegisterSteps;
import java.io.IOException;

@RunWith(SerenityRunner.class)
public class RegisterTest {
    @Managed
    WebDriver driver;
    @Steps
    RegisterSteps rs;
    @Test
    public void loginasadmin() throws InterruptedException, IOException, InvalidFormatException {

       rs.urlopen();
       rs.registerClick();
        rs.registerdetails();
      //  Thread.sleep(5000);
    }

    }
