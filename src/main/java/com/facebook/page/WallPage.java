package com.facebook.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WallPage extends LoginPage{

    private final By lnkHome =  By.xpath("//div/a[@aria-label='Home']");

    public boolean isHomeButtonDisplaying(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(lnkHome)).isDisplayed();
    }

    public void navigateToMessagesByURL(){
        driver.navigate().to("https://web.facebook.com/messages/t");
    }

}
