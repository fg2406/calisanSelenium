package slackSorular;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) throws InterruptedException {
        /*
        1-driver olusturalim
        2-java class'imiza chromedriver.exe'yi tanitalim
        3-driver'in tum ekrani kaplamasini saglayalim
        4-https://github.com/ adresine gidelim
        5-Ardindan https://www.hepsiburada.com/ adrsine gidelim
        6-Title ve url console da yazdirin ve yine title ve url in "burada" kelimesini icerip icermedigini kontrol edelim
        7-Sonrasinda https://github.com/ adresine geri donelim ve  sayfayi yenileyelim
        8-Son adim olarak butun sayfalarimizi kapatmis olalim
     */


        System.setProperty("webdriver.chrome.driver", "Resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.navigate().to("https://github.com/");
        String handle1 = driver.getWindowHandle();

        Thread.sleep(500);

        driver.navigate().to("https://www.hepsiburada.com/");
        String handle2 = driver.getWindowHandle();

        String actualTittle = driver.getTitle();
        String expectedTitle = "burada";

        if (actualTittle.contains(expectedTitle)) {

            System.out.println("Pass");

        } else {
            System.out.println("faild\nactualTitle :" + actualTittle);
        }

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "burada";

        if (actualTittle.contains(expectedUrl)) {

            System.out.println("Pass");

        } else {
            System.out.println("faild\nactualTitle :" + actualUrl);
        }


       while (driver.getCurrentUrl().equals("https://www.hepsiburada.com/")) {
            driver.navigate().back();
        }
        Thread.sleep(2000);
        driver.navigate().refresh();



       /* driver.navigate().back();
         String actualT=driver.getTitle();
         System.out.println(actualT);
         Thread.sleep(5000); */



        driver.manage().window().fullscreen();
        driver.manage().window().getSize();
        driver.manage().window().getPosition();


        driver.close();


    }
}

