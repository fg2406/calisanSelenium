package Ubung_JUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_LocatorsClassName {


   public static  void  main(String[]args) throws InterruptedException {

     //main ile calisir,mutlaka main olusturulmalidir
     /*baslica Locators ler
     * name
     * Class name
     * Id
     * Link Text
     * Partial Link Text
     * Css Selector
     * Xpath */

       System.setProperty("webdriver.chrome.driver","Resources/Drivers/chromedriver.exe"); //bu olmak zorundadir,2.si dosya yolu
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


       driver.get("https://login.yahoo.com");
       driver.findElement(By.id("createacc")).click();
       Thread.sleep(2000);
       // String isim="filiz";  bunu yapip
       // driver.findElement(By.name("firstName")).sendKeys(isim); olabilir

       //isim
       driver.findElement(By.name("firstName")).sendKeys("filiz");

       Thread.sleep(3000);

       //soyisim
       driver.findElement(By.className("ureg-lname")).sendKeys("gül");








   }





}
