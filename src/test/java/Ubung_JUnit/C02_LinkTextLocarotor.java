package Ubung_JUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_LinkTextLocarotor {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Resources/Drivers/chromedriver.exe"); //bu olmak zorundadir,2.si dosya yolu

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://login.yahoo.com");

        // driver.findElement(By.linkText("Kullanıcı adınızı mı unuttunuz?")).click();

        driver.findElement(By.partialLinkText("Kullanıcı")).click();  //bir kisminida girebiliriz yukardaki ile ayni isi yapar




    }

}
