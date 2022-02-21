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



        /*  etiketadi[baslik=value]

        todo Child bularak ve basit hali

      /html>body>div>style

       html>body>div>div
     ///
     input[class*=gLF] --> * varsa value nun hesoni yazmasak gene calisir
        input[id*='user']
      input[id*='name']
      input[class*=gLFyf]
      div[class^='R']
      input[class=gNO89b]


      // *todo  #id ile kullanmak istersek
          div[id=footer]
          div#footor
      # todo class . varsa class demek
      birkac class almak istersek aralarina nokta koyariz
      input.gNO89b -->tagName.value,nokta class simgeler,value class'in degeri
      .gNO89b bu sekilde de kullanilir    */



     driver.findElement(By.cssSelector("input[class*=gLF]")).sendKeys("Java"+ Keys.ENTER);







    }



}
