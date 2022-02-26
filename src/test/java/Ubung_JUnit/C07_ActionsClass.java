package Ubung_JUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class C07_ActionsClass {

    //maus' un istedigmiz yerde gezmesidir,action bir class tir obje olusturarak kullanilir
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","Resources/Drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.etsy.com");

        driver.findElement(By.xpath("//button[text()='Akzeptieren']")).click();
        Actions actions=new Actions(driver);

    }

}
