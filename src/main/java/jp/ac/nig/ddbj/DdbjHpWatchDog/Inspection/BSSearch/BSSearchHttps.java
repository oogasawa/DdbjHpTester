/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.BSSearch;

import java.util.ArrayList;
import java.util.List;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.Inspection;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author oogasawa
 */
public class BSSearchHttps implements Inspection {
    
    private String url = "https://ddbj.nig.ac.jp/BSSearch/";
    
    public ArrayList<String> inspect(WebDriver driver) {
        ArrayList<String> messages = new ArrayList<>();
        
        messages.add(showUrl());
        messages.add(checkTitle(driver));
        messages.add(checkUrl(driver));
        
        return messages;
    }
    
      public String showUrl() {
        return "[info] BSSearchHttps > showUrl : " + url;
    }
    
    public String checkTitle(WebDriver driver) {
        String message = new String();
        
        long start = System.currentTimeMillis();
        
        try {
            driver.get(url);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[@class='title']")));
            
            List<WebElement> elems = driver.findElements(By.xpath("//h3[@class='title']"));
            if (elems.size() > 0)
                message = "[info] BSSearchHttps > checkTitle : " + elems.get(0).getText();
            else
                message = "[warning] BSSearchHttps > checkTitle : [EMPTY]";
            
        } catch (TimeoutException e) {
            message = "[error] BSSearchHttps > checkTitle : " + "[TIMEOUT]";
        } catch (Exception e) {
            message = "[error] BSSearchHttps > checkTitle : " + "[UNEXPECTED ERROR]";
        }

        long end = System.currentTimeMillis();
        String elapsedTime = String.format("%1$.3f", (end-start)/1000.0);

        return message + "\t" + elapsedTime;  
    }
    
    public String checkUrl(WebDriver driver) {
        String message = new String();
        
        long start = System.currentTimeMillis();
        
        try {
            driver.get(url);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[@class='title']")));
            
            String curUrl = driver.getCurrentUrl();
            
            message = "[info] BSSearchHttps > checkURL : " + curUrl;
            
        } catch (TimeoutException e) {
            message = "[error] BSSearchHttps > checkURL : " + "[TIMEOUT]";
        } catch (Exception e) {
            message = "[error] BSSearchHttps > checkURL : " + "[UNEXPECTED ERROR]";
        }

        long end = System.currentTimeMillis();
        String elapsedTime = String.format("%1$.3f", (end-start)/1000.0);

        return message + "\t" + elapsedTime;  
    }

    
}
