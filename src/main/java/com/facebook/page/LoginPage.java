package com.facebook.page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private final By txtUsername =  By.id("email");
    private final By txtPassword =  By.id("pass");
    private final By btnName =  By.name("login");

    protected static WebDriver driver;

//    static {
//        WebDriverManager.chromedriver().setup();
//        //  WebDriver driver = new ChromeDriver();
//
//        ChromeOptions options = new ChromeOptions();
////        options.addArguments("--headless");
//
//        driver = new ChromeDriver(options);
//        driver.get("https://web.facebook.com/");
//    }

    public void setupBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");  //Uncomment this to run headless
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://web.facebook.com/");
        driver.manage().window().maximize();
    }

    public void loginWithCredentials(String username, String password){
        setupBrowser();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtUsername)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtPassword)).sendKeys(password);
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnName)).click();
    }
}
