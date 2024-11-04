package comsaucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        //set up Firefox browser
        WebDriver driver = new FirefoxDriver();

        //Open the URL into Browser
        driver.get(baseUrl);

        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        // Print the current Url
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current url " + currentUrl);

        // print the page source
        System.out.println("The page source : " + driver.getPageSource());

        //enter the email in the email filed
        WebElement emailFiled = driver.findElement(By.id("user-name"));
        emailFiled.sendKeys("xyz.123@gmail.com");

        //enter the password in the password filed
        WebElement passwordFiled = driver.findElement(By.id("password"));
        passwordFiled.sendKeys("1234");

        //Click on login button
        WebElement loginLink = driver.findElement(By.id("login-button"));
        loginLink.click();

        // Print the current url
        System.out.println("After login :" + currentUrl);

        //Navigate to baseUrl
        driver.navigate().to(baseUrl);

        // refresh the page
        driver.navigate().refresh();

        // close the browser
        driver.quit();
    }
}
