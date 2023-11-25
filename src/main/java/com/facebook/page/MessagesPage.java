package com.facebook.page;

import org.openqa.selenium.AcceptedW3CCapabilityKeys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class MessagesPage extends LoginPage{

    private final By btnMessage =  By.xpath("//div[@class='x1n2onr6']/div");

    public void gatherNumberOfTreads(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnMessage));
        List<WebElement> threads = driver.findElements(btnMessage);
        System.out.println(threads.size());
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(btnMessage));
        actions.build().perform();
    }

}
