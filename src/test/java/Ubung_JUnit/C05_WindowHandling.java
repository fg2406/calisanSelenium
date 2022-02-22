package Ubung_JUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class C05_WindowHandling {

// bir siteye dittigimizde,tikladigimiz bir urun vs.bizi farkli bir sayfaya yonlendirebilir
    //bu durumda test devam edebilmek icin  windowHnadlig gerekebilir,driver onceki sayfalada kaldigi icin

    //window String atariz
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Resources/Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        driver.get("https://demo.guru99.com/popup.php");

        //driver.findElement(By.xpath("//*[@id=\"save\"]/span[1]")).click();
        String firstWin=driver.getWindowHandle();
        System.out.println("baslangic pencerem :"+firstWin);

        String firstWinUrl= driver.getCurrentUrl();
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        //click yapinca farkli bir sayfaya yonlendirdi ve driver onceki sayfada kaldi
        //bu sayfada islem yapabilmek icin driver bu sayfaya almaliyiz
        //bunun icin set yapip bulunulan sayfanin windowHandle alinir
        //ve switchTo ile driver getirirlir


        Set<String>  windowAllWindows=driver.getWindowHandles();

       /* for (String each:windowAllWindows) {
            driver.switchTo().window(handle2);
       !!eger 2.sayfasinin windows hand degerini
       gormek istemezsek burdaki gibi yapmak yeterli
        } */


        String handle2="";
        for (String each:windowAllWindows) {

             if (!windowAllWindows.equals(firstWin)){
                    handle2= each;
             }
        }
        driver.switchTo().window(handle2) ;
        System.out.println("2.pencere windows handle degeri :"+handle2);


        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("flz@gmail.com"+ Keys.ENTER);

        //driver set ile aldik ve degeri girdik

        System.out.println("2.pencerenin Url'i :"+ driver.getCurrentUrl());
        driver.close();   //sayfa kapandi ama bizim ilk pencereye


        //driver'i gecirmemiz lazim,bunun icin windowHndle kulllaniriz

        driver.switchTo().window(firstWin);
        System.out.println("suanki sayfasinin Url :"+driver.getCurrentUrl());
        Thread.sleep(3000);










    }


}
