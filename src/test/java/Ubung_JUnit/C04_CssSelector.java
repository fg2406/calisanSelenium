package Ubung_JUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_CssSelector {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Resources/Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://www.google.de");
        driver.findElement(By.xpath("//div[text()='Kabul ediyorum']")).click();



        /* Xpath deki gibi @ ve // yoktur
         Xpath -->  //etiketadi[@baslik='value']
         CssSelectorda--> etiketadi[baslik=value]  virgul icine alma istege bagli


        todo Child bularak ve basit hali
       Xpath 'de child ulasrken html//body//header ... kullanirdik // ile olurdu
       ama css selector de > isaret ile yapilir
      /html>body>div>style
      / div.J9leP>:first-child --> ilk child veririr
      div#searchform>:nth-child
      div[id$=form] --> div de id'si sonu form ile biteni ver demek

       html>body>div>div
     ///

      div[class^='R']
      input[class=gNO89b]


      // *todo  #id ile kullanmak istersek
          div[id=footer]
          div#footor

          basina # koyulup yapilabilir yada div[id=footer] divlerin icinde id si footerleri veririr
          #footer   -- > id footer olanalrin hepsini verir

      # todo class . varsa class demek
      birkac class almak istersek aralarina nokta koyariz
      input.gNO89b -->tagName.value,nokta class simgeler,value class'in degeri
      .gNO89b bu sekilde de kullanilir

       # contains --> icinde bunlar olani ver demek
       input[class*=gLF] --> * varsa value nun hesoni yazmasak gene calisir
        input[id*='user']
      input[id*='name']
      input[class*=gLFyf]

         */



     driver.findElement(By.cssSelector("input[class*=gLF]")).sendKeys("Java"+ Keys.ENTER);







    }



}
