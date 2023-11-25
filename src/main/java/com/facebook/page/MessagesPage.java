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

    private final By btnMessage =  By.xpath("//div[@aria-label='Chats']//div[@class='x1n2onr6']/div");
    private List<WebElement> threads;
    private final By btnOptions = By.xpath("//div[@class='x1i64zmx']/div");
    private final By btnDelete = By.xpath("//div[@role='menuitem' and normalize-space()='Delete chat']");

    public void gatherNumberOfTreads() throws InterruptedException {
        Thread.sleep(5);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
//        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(btnMessage));
            threads = driver.findElements(btnMessage);
            System.out.println(threads.size());
//        }
//        catch (Exception e){
//            wait.until(ExpectedConditions.visibilityOfElementLocated(btnMessage));
//            threads = driver.findElements(btnMessage);
//            System.out.println(threads.size());
//        }
//        wait.until(ExpectedConditions.visibilityOfElementLocated(btnMessage));
//        threads = driver.findElements(btnMessage);
//        System.out.println(threads.size());
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(btnMessage));
        actions.build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnOptions)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnDelete)).click();
    }

}
