/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.DdbjStaticPages;

import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.DdbjTopPage.*;
import java.util.ArrayList;
import java.util.List;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.Inspection;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/** http://ddbj.nig.ac.jp/ にアクセスした時の挙動をレポートする.
 *
 * @author oogasawa
 */
public class DdbjStaticPagesHttp implements Inspection {
    
    private String url = "http://www.ddbj.nig.ac.jp/intro-j.html";
    
    public ArrayList<String> inspect(WebDriver driver) {
        ArrayList<String> messages = new ArrayList<>();
        
        messages.add(showUrl());
        messages.add(checkTitle(driver));
        messages.add(checkUrl(driver));
        
        return messages;
    }
    
    public String showUrl() {
        return "[info] DdbjStaticPagesHttp > showUrl : " + url;
    }
    
    
    public String checkTitle(WebDriver driver) {
        String message = new String();
        
        long start = System.currentTimeMillis();
        
        try {
            driver.get(url);
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1")));
            
            List<WebElement> elems = driver.findElements(By.xpath("//h1"));
            if (elems.size() > 0)
                message = "[info] DdbjStaticPagesHttp > checkTitle : " + elems.get(0).getText();
            else
                message = "[warning] DdbjStaticPagesHttp > checkTitle : [EMPTY]";
            
        } catch (TimeoutException e) {
            message = "[error] DdbjStaticPagesHttp > checkTitle : " + "[TIMEOUT]";
        } catch (Exception e) {
            message = "[error] DdbjStaticPagesHttp > checkTitle : " + "[UNEXPECTED ERROR]";
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
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1")));
            
            String curUrl = driver.getCurrentUrl();
            
            message = "[info] DdbjStaticPagesHttp > checkURL : " + curUrl;
            
        } catch (TimeoutException e) {
            message = "[error] DdbjStaticPagesHttp > checkURL : " + "[TIMEOUT]";
        } catch (Exception e) {
            message = "[error] DdbjStaticPagesHttp > checkURL : " + "[UNEXPECTED ERROR]";
        }

        long end = System.currentTimeMillis();
        String elapsedTime = String.format("%1$.3f", (end-start)/1000.0);

        return message + "\t" + elapsedTime;  
    }
    
    
}
