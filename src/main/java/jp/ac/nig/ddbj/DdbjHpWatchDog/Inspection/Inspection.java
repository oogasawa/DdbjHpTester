/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.ac.nig.ddbj.DdbjHpWatchDog.Inspection;

import java.util.ArrayList;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author oogasawa
 */
public interface Inspection {
    
    public ArrayList<String> inspect(WebDriver driver);
    
}
