package page_objects;

import engine.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebook {

    private WebDriver driver;
    public Facebook(Driver driver){
        this.driver = driver.get();
    }

    public void verifyLoginButton() {
        WebElement btnLogin = driver.findElement(By.xpath(".//button[@name='login']"));
        Boolean isDisplayed = btnLogin.isDisplayed();
        Assert.assertEquals(true , isDisplayed);
    }
}
