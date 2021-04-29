package page_objects;

import engine.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google {

    private WebDriver driver;

    public Google(Driver driver) {
        this.driver = driver.get();
    }

    public void enterSearch(String searchName) {
        WebElement txtSearch = driver.findElement(By.xpath(".//input[@title='Search']"));
        txtSearch.sendKeys(searchName);
    }

    public void clickAvatar() {
        driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[2]/div[2]/div[1]/a/img")).click();
    }

    public void clickSearch() {

        driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[1]")).click();
    }

    public void clickFacebook() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//span[text()='Facebook - Log In or Sign Up']")));
        driver.findElement(By.xpath(".//span[text()='Facebook - Log In or Sign Up']")).click();
    }
}
