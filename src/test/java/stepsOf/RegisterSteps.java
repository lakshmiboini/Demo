package stepsOf;


import net.thucydides.core.annotations.Step;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import pageObjects.Register;

import java.io.IOException;

public class RegisterSteps {
    Register r;

    @Step
    public void urlopen() {
        r.url();
    }

    @Step
    public void registerClick()
    {
        r.registerClick();
    }

    @Step
    public void registerdetails() throws IOException, InvalidFormatException {
        r.registerDetails();
    }
}