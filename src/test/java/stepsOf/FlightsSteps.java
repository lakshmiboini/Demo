package stepsOf;

import net.thucydides.core.annotations.Step;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import pageObjects.Flights;


import java.io.IOException;

public class FlightsSteps {
    Flights pages;
    @Step
    public void openurl(){
        pages.url();
    }
    @Step
    public void enter_username(){
        pages.enterusername();
    }
    @Step
    public void enterpwd()  {
        pages.enterpassword();
    }
    @Step
    public void submit(){
        pages.submitbtn();
    }
    @Step
    public void clickingbtn(){
        pages.clickflightbutton();
    }
    @Step
    public void radiobtn(){
        pages.radiobutton();
    }
    @Step
    public void addblocking(){
        try{
            pages.addblock();
        }catch(Exception e){
            System.out.println("The add has not blocked "+" @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        }
    }
    @Step
    public void drop1(){
        pages.selectdrop1();
    }
    @Step
    public void drop2(){
        pages.selectdrop2();
    }
    @Step
    public void drop3(){
        pages.selectdrop3();
    }
    @Step
    public void drop4(){
        pages.selectdrop4();
    }
    @Step
    public void drop5(){
        pages.selectdrop5();
    }
    @Step
    public void drop6(){
        pages.selectdrop6();
    }
    @Step
    public void drop7(){
        pages.selectdrop7();
    }
    public void clickingbtn1(){
        pages.clickingbutton();
    }
    public void dropdown(){
        pages.selectdropdown();
    }
    public void continuebutton(){
        pages.selectcontinue();
    }
}
