package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Flights extends PageObject {

    public void url(){
        open();
    }

    public void enterusername()  {


        find(By.name("userName")).type("lakshmi");

    }
    public void enterpassword() {
        find(By.name("password")).type("lakshmi123");

    }
    public void submitbtn(){
        find(By.name("submit")).click();
    }
    public void clickflightbutton(){
        $("//a[text()='Flights']").click();

    }
    public void addblock(){
        $("//span[text()='Close']").click();
    }
    public void radiobutton(){
        WebElement element,element1;
        element1= $("(//input[@name='tripType'])[1]");
        element=  $("(//input[@name='tripType'])[2]");

        if(element1.isEnabled()){
            element1.click();
        }
        element.click();
    }
    public void selectdrop1(){
        $("//select[@name='passCount']").selectByVisibleText("2 ");
    }
    public void selectdrop2(){
        $("//select[@name='fromPort']").selectByVisibleText("London");
    }
    public void selectdrop3(){
        $("//select[@name='fromMonth']").selectByVisibleText("September");

    }
    public void selectdrop4(){
        $("//select[@name='fromDay']").selectByVisibleText("8");
    }
    public void selectdrop5(){
        $("//select[@name='toPort']").selectByVisibleText("Sydney");
    }
    public void selectdrop6(){
        $("//select[@name='toMonth']").selectByVisibleText("October");
    }
    public void selectdrop7(){
        $("//select[@name='toDay']").selectByVisibleText("7");
    }
    public void clickingbutton(){
        $("(//input[@name='servClass'])[3]").click();
    }
    public void selectdropdown(){
        $("//select[@name='airline']").selectByVisibleText("Blue Skies Airlines");
    }
    public void selectcontinue(){
        $("//input[@name='findFlights']").click();
    }

}

