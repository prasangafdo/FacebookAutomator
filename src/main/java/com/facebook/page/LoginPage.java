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
    private final By txtPassword =  By.id("passContainer");

    private static WebDriver driver;

    static {
        WebDriverManager.chromedriver().setup();
        //  WebDriver driver = new ChromeDriver();

        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");

        driver = new ChromeDriver(options);
    }

    public void loginWithCredentials(String username, String password){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtUsername)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtPassword)).sendKeys(password);
    }
}
