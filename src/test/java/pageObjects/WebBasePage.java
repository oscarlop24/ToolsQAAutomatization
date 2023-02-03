package pageObjects;

import definitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.awaitility.Awaitility.await;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebBasePage extends PageObject {
    public boolean isVisible(WebElement element) {
        try {
            return element.isDisplayed();
        }catch (Exception e){
            return false;
        }

    }

    public void waitUntilElementIsVisible(WebElement element, int time) {
        new WebDriverWait(Hooks.getDriver(), time).until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilElementIsVisibleNonThrow(WebElement element, int time) {
        try{
            new WebDriverWait(Hooks.getDriver(), time).until(ExpectedConditions.visibilityOf(element));
        }catch (Exception e){
            System.out.println("Se presentó el error:" + e);
        }

    }

    public WebElement returnElement(String xPath, String option) {
        return element(By.xpath(xPath.replace("Replaceable", option)));
    }

    public void waiting(int time) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException c) {
            throw new RuntimeException();
        }
    }
}
