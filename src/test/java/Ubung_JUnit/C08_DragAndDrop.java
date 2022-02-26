package Ubung_JUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class C08_DragAndDrop {
    //bir yerden bir yere tasirken,yerlerini driver tanitmamiz lazim,iki tarafinda locate ihtiyaci var



    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","Resources/Drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");


        //baskentler

        WebElement oslo= driver.findElement(By.id("box1"));
        WebElement wash= driver.findElement(By.id("box3"));
        WebElement copenh= driver.findElement(By.id("box4"));
        WebElement madrid= driver.findElement(By.id("box5"));
        WebElement stockl= driver.findElement(By.id("box2"));
        WebElement rome= driver.findElement(By.id("box6"));
        WebElement seoul= driver.findElement(By.id("box7"));


       //ulkeler

        WebElement italy=driver.findElement(By.id("box106"));
        WebElement spain=driver.findElement(By.id("box107"));
        WebElement norway=driver.findElement(By.id("box101"));
        WebElement denmark =driver.findElement(By.id("box104"));
        WebElement southKorea=driver.findElement(By.id("box105"));
        WebElement sweden=driver.findElement(By.id("box102"));
        WebElement unitedStates  =driver.findElement(By.id("box103"));

        //baskentleri ulkeler uzerine tasiyacagiz
        //Action class indan drogAndDrop ile

        Actions actions=new Actions(driver);

        actions.dragAndDrop(rome,italy).build().perform();
        actions.dragAndDrop(seoul,southKorea).build().perform();
        actions.dragAndDrop(stockl,sweden).build().perform();
        actions.dragAndDrop(oslo,norway).build().perform();
        actions.dragAndDrop(madrid,spain).build().perform();
        actions.dragAndDrop(wash,unitedStates).build().perform();
        actions.dragAndDrop(copenh,denmark).build().perform();









    }



}
