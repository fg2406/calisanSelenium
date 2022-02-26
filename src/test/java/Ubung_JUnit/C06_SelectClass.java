package Ubung_JUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C06_SelectClass {

    public static void main(String[] args) throws InterruptedException {

      //bir sayfaya gittigimizda onumuze seceneklerin oldugu seyler cikabilir,seyahat ederken ulke secimi,
      //amazonda vs.birsey ararken urunler kismi tikladigimizda bircok secenek cikiyor
      //bunlara dropDown denir,select Class'indan yararlanarak yapilir,bu bir class ise
     //kullanmak icin obje olustirmaya ihtiyac vardir

        System.setProperty("geckodriver.exe","Resources/Drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        driver.findElement(By.xpath("//button[@id='ez-accept-all']")).click();  //alert cikti

        WebElement cookies=driver.findElement(By.cssSelector("span.cookie-choices-buttons>:nth-child(2)"));  //cookies
        cookies.click();

        WebElement isim= driver.findElement(By.name("firstname"));
        isim.sendKeys("flz");

        WebElement soyisim= driver.findElement(By.name("lastname"));
        soyisim.sendKeys("gul");

        //Gender
        WebElement gender= driver.findElement(By.id("sex-1"));
        gender.click();



         //butun siklarin ustinde gezsin istedigim icin list atadim
        List<WebElement> list=driver.findElements(By.cssSelector("div[dir=ltr]>:nth-child(14)>input"));

        for (int i = 0; i < list.size() ; i++) {
            list.get(i).click();
            Thread.sleep(500);
        }


        //Date
        WebElement date=driver.findElement(By.cssSelector("#datepicker"));
        date.sendKeys("20.02.2022");

        //Profession

        WebElement profession= driver.findElement(By.xpath("//input[@value='Automation Tester']"));
        profession.click();

        //Automation,hepsine tiklamasini isedim liste attim


        List<WebElement> tools=driver.findElements(By.xpath("(//div[@class='control-group'])[7]//input"));

        for (WebElement tool:tools){
            tool.click();
            Thread.sleep(500);

        }

      //Select class

        WebElement ContienentsElement=driver.findElement(By.cssSelector("#continents"));
        Select slc=new Select(ContienentsElement);
        slc.selectByVisibleText("Africa"); //text ile de alinabilir

        WebElement element=driver.findElement(By.cssSelector("#selenium_commands"));
        slc=new Select(element);
        slc.selectByIndex(0);  //index ilede alinabilir
        slc.selectByIndex(2);
        driver.close();

    }



}
