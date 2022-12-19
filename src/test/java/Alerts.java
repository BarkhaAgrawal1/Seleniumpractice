import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Alerts {
    @Test
    public void al() throws InterruptedException, IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        driver.get("https://nxtgenaiacademy.com/multiplewindows");
       driver.findElement(By.id("button1"));
      String main =  driver.getWindowHandle();
        String a = driver.getTitle();
        System.out.println(a);

        driver.findElement(By.partialLinkText("Menu"));
        Set<String>handel = driver.getWindowHandles();
        Iterator itr = handel.iterator();
        while (itr.hasNext()){
            itr.next();}
        driver.switchTo().window(main);
        String ab = driver.getTitle();
        System.out.println(ab);


        }


    }

//Taking screen shots and uploading file
//  driver.get("http://www.whiteboxqa.com/");
//
//          File Screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//          FileUtils.copyFile(Screen,new File("C:\\Users\\deepa\\OneDrive\\Desktop\\Demo3\\Demo.png"));
//
//          driver.get("https://demoqa.com/automation-practice-form");
//          WebElement a = driver.findElement(By.id("uploadPicture"));
//          a.sendKeys("C:\\Users\\deepa\\OneDrive\\Desktop\\Demo3\\Demo.png");



//Fluent Wait
//    Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
//            .withTimeout(20,TimeUnit.SECONDS)
//            .pollingEvery(5,TimeUnit.SECONDS)
//            .ignoring(NegativeArraySizeException.class);



//using Java script executor for scrolling down on the window
// driver.get("http://www.whiteboxqa.com/");
//         Thread.sleep(1000);
//         JavascriptExecutor js=(JavascriptExecutor) driver;
//         js.executeScript("window.scrollBy(0,500)");





//Drag and drop
//    WebElement a = driver.findElement(By.id("draggable"));
//    WebElement b = driver.findElement(By.id("droppable"));
//    Actions dd = new Actions(driver);
//        dd.dragAndDrop(a,b).perform();









//if we have to select options in dropdown
//        if(s.isMultiple()){
//        s.selectByIndex(2);
//        s.selectByVisibleText("Black");


//    WebElement a = driver.findElement(By.id("oldSelectMenu"));
// a.click();
//         Select s = new Select(a);
//         s.selectByVisibleText("Yellow");



// clicks and right click
//    WebElement a = driver.findElement(By.id("rightClickBtn"));
//    Actions b = new Actions(driver);
//  b.contextClick(a).perform();

//double click
//    WebElement a =   driver.findElement(By.id("doubleClickBtn"));
//    Actions ab = new Actions(driver);
//        ab.doubleClick(a).perform();

//creating Alert interface
//         driver.findElement(By.id("promtButton")).click();
//         Alert a =driver.switchTo().alert();
//         a.sendKeys("Hello");
//                 a.accept();


//         driver.navigate().back();
//         Thread.sleep(3000);
//        driver.navigate().forward();
//        String a = driver.getCurrentUrl();
//        System.out.println(a);
//        driver.close();






//         driver.findElement(By.id("alertButton")).click();
//
//         Alert sm = driver.switchTo().alert();
//         sm.accept();




