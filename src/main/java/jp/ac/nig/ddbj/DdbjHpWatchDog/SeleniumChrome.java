package jp.ac.nig.ddbj.DdbjHpWatchDog;


import java.util.ArrayList;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.BPSearch.BPSearchHttp;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.BPSearch.BPSearchHttps;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.BSSearch.BSSearchHttp;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.BSSearch.BSSearchHttps;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.DWay.DWayHttp;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.DWay.DWayHttps;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.DWay.TraceDWayHttp;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.DWay.TraceDWayHttps;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.DdbjTopPage.DdbjTopPageHttp;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.DdbjTopPage.DdbjTopPageHttps;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.DraSearch.DraSearchHttp;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.DraSearch.DraSearchHttps;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.Inspection;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.ScTopPage.ScTopPageHttp;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.ScTopPage.ScTopPageHttps;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.BPSearch.TraceBPSearchHttp;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.BPSearch.TraceBPSearchHttps;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.BSSearch.TraceBSSearchHttp;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.BSSearch.TraceBSSearchHttps;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.DdbjStaticPages.DdbjStaticPages2Http;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.DdbjStaticPages.DdbjStaticPages2Https;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.DdbjStaticPages.DdbjStaticPagesHttp;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.DdbjStaticPages.DdbjStaticPagesHttps;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.DdbjTopPage.DdbjTopPage2Http;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.DdbjTopPage.DdbjTopPage2Https;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.DraSearch.TraceDraSearchHttp;
import jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection.DraSearch.TraceDraSearchHttps;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriverWait;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SeleniumChrome {
    
    private static WebDriver driver = null;
    
    public static void main(String[] args) {
        
        SeleniumChrome obj = new SeleniumChrome();
        obj.startBrowser();
        
        obj.checkScTopPage();
        obj.checkDdbjTopPage();
        obj.checkDdbjStaticPages();

        obj.checkDraSearch();
        obj.checkDWay();
        
        obj.checkBPSearch();
        obj.checkBSSearch();
        
        obj.quitBrowser();
                
    }
    
    
    public void checkDdbjTopPage() {
        
        Inspection ins = null;
                
        ins = new DdbjTopPageHttps();
        printMessages(ins.inspect(driver));
        
        ins = new DdbjTopPageHttp();
        printMessages(ins.inspect(driver));
        
        ins = new DdbjTopPage2Https();
        printMessages(ins.inspect(driver));
        
        ins = new DdbjTopPage2Http();
        printMessages(ins.inspect(driver));
        
        
        System.out.println();
   
    }
    
    
       public void checkDdbjStaticPages() {
        
        Inspection ins = null;
                
        ins = new DdbjStaticPagesHttps();
        printMessages(ins.inspect(driver));
        
        ins = new DdbjStaticPagesHttp();
        printMessages(ins.inspect(driver));
        
        ins = new DdbjStaticPages2Https();
        printMessages(ins.inspect(driver));
        
        ins = new DdbjStaticPages2Http();
        printMessages(ins.inspect(driver));
        
        
        System.out.println();
   
    }
    
    public void checkScTopPage() {
        
        Inspection ins = null;
                
        ins = new ScTopPageHttps();
        printMessages(ins.inspect(driver));
        
        ins = new ScTopPageHttp();
        printMessages(ins.inspect(driver));
        
        System.out.println();
   
    }
    
    public void checkDWay() {
        
        Inspection ins = null;
                
        ins = new TraceDWayHttps();
        printMessages(ins.inspect(driver));
        
        ins = new TraceDWayHttp();
        printMessages(ins.inspect(driver));
   
        
        ins = new DWayHttps();
        printMessages(ins.inspect(driver));
        
        ins = new DWayHttp();
        printMessages(ins.inspect(driver));
        
        System.out.println();
        
    }
    
    
    public void checkDraSearch() {
        
        Inspection ins = null;
                
        ins = new TraceDraSearchHttps();
        printMessages(ins.inspect(driver));
        
        ins = new TraceDraSearchHttp();
        printMessages(ins.inspect(driver));
   
        
        ins = new DraSearchHttps();
        printMessages(ins.inspect(driver));
        
        ins = new DraSearchHttp();
        printMessages(ins.inspect(driver));
        
        System.out.println();
        
    }
    
    
    
    public void checkBPSearch() {
        
        Inspection ins = null;
                
        ins = new TraceBPSearchHttps();
        printMessages(ins.inspect(driver));
        
        ins = new TraceBPSearchHttp();
        printMessages(ins.inspect(driver));
   
        
        ins = new BPSearchHttps();
        printMessages(ins.inspect(driver));
        
        ins = new BPSearchHttp();
        printMessages(ins.inspect(driver));
        
        System.out.println();
        
    }
    
    
     public void checkBSSearch() {
        
        Inspection ins = null;
                
        ins = new TraceBSSearchHttps();
        printMessages(ins.inspect(driver));
        
        ins = new TraceBSSearchHttp();
        printMessages(ins.inspect(driver));
   
        
        ins = new BSSearchHttps();
        printMessages(ins.inspect(driver));
        
        ins = new BSSearchHttp();
        printMessages(ins.inspect(driver));
        
        System.out.println();
        
    }
    
    
    
    
    
    public void printMessages(ArrayList<String> messages) {
        for (String m: messages) 
            System.out.println(m);
    }
    
    

    
    
    /** Seleniumのchromedriverへのパスを返す.
     * 
     * 現行バージョンでは$HOME/jar-files/chromedriverを返す。
     * 
     * TODO: one-jarにまとめる時にresourcesディレクトリの中にでもchromedriverを入れてしまい、
     * jarファイルが一つあれば動くようにできないか。
     * 
     * @return Selenium chromedriverへのパス。
     */
    public String getChromeDriverPath() {
        return System.getenv("HOME") + "/jar-files/chromedriver";
    }
            
    
    public void startBrowser() {
        System.setProperty("webdriver.chrome.driver", getChromeDriverPath());
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--lang=" + locale);
        //ChromeDriver driver = new ChromeDriver(options);
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1000, 800));  
        //return driver;
    }
    
    
    public void quitBrowser() {
        driver.quit();
    }
 
}



