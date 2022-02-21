package Ubung_JUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Xpath {

      public static void main(String[] args) {

         System.setProperty("webdriver.chrome.driver","Resources/Drivers/chromedriver.exe"); //bu olmak zorundadir,2.si dosya yolu
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

         driver.get("https://www.google.de");
         driver.findElement(By.xpath("//div[text()='Kabul ediyorum']")).click();




         /* Xpath,daha spesifik olup dinamik ögereleri rahatlikla bulmamizi saglar
         Basic xpath=//tagname[@attribute='value'] --->    //etiketadi[@nitelik='deger']

          //1.Absolute Xpath
           /html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input



         //2.Relative Xpath
          //input[@name='q']


         //3.Contains(ait olmak)

         Dinamik degisikliklerin olabilecei durumlarda:

          Xpath//*[contains(type,'sub')] ---
         //etiketadi(contains(@nitelik,'deger')]    * isareti tüm html kodlarini kapsar

           4.Starts-with()
           Aramalarimizda uzun kodlari daha kolay bulmamizi saglar

            //input[starts-with(@class,'gLFyf')]

           5.OR,AND
           OR icin iki kisimdan bir tanesinin dogru olmasi yeterli mesela:ilk Xpath veya 2. dogruysa  calisir
            AND icin iki tarafin da dogru olmasi gerekiyor
           //input[@class='gLFyf gsfi' or @name='q']   bu yada bu hzangisi dogru ise calisir
            //input[starts-with(@class,'gLF')and @type='text'] start-with dolayi hata  vermedi,bir kismini yazmamiza ragmen

          */


          driver.findElement(By.xpath("//input[starts-with(@class,'gLFyf')]")).click();//class tan sonra value hepsini yazmasakta
          //elementi bulmamaiza olanak tanir














      }





}
