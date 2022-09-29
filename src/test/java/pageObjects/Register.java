package pageObjects;

import net.thucydides.core.pages.PageObject;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.By;
import utilities.DataDriven;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Register extends PageObject {

 public void url(){
  open();
 }

 public void  registerClick(){
    $(By.xpath("//a[text()='REGISTER']")).click();
}
public void  registerDetails() throws IOException, InvalidFormatException {

    DataDriven reader=new DataDriven();
   List<Map<String,String>> data=reader.getData("C:\\Users\\LakshmiBoini-Kairos\\IdeaProjects\\serenityGuru\\src\\test\\resources\\TestData\\dataserenity.xlsx","sheet1");
    $(By.name("firstName")).sendKeys(data.get(0).get("firstName"));
    $(By.name("lastName")).sendKeys(data.get(0).get("lastName"));
    $(By.xpath("//input[@name='phone']")).sendKeys(data.get(0).get("phone"));
    $(By.name("userName")).sendKeys(data.get(0).get("email"));
    $(By.name("address1")).sendKeys(data.get(0).get("Address"));
    $(By.xpath("//input[@name='city']")).sendKeys(data.get(0).get("city"));
    $(By.xpath("//input[@name='state']")).sendKeys(data.get(0).get("state"));
    $(By.xpath("//input[@name='postalCode']")).sendKeys(data.get(0).get("postalcode"));
    $(By.xpath("//select[@name='country']")).sendKeys(data.get(0).get("country"));
    $(By.xpath("//input[@name='email']")).sendKeys(data.get(0).get("username"));
    $(By.xpath("//input[@name='password']")).sendKeys(data.get(0).get("password"));
    $(By.xpath("//input[@name='confirmPassword']")).sendKeys(data.get(0).get("confirmpassword"));
    $(By.xpath("//input[@name='submit']")).click();

 }

}
