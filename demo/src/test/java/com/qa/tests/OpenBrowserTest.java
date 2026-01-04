package com.qa.tests;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class OpenBrowserTest {
    WebDriver driver;

    @Parameters("url")
    // @BeforeMethod(alwaysRun = true)
    public void SetUp(@Optional("https://the-internet.herokuapp.com") String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @BeforeMethod(alwaysRun = true)
    public void SetUpShoppingURL() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
    }

    @Test (enabled = false)
    // To get link and store all links's text
    public void openBrowser() {

       List<WebElement> links= driver.findElements(By.tagName("a"));
       System.out.println("Total Links:" + links.size());

       Iterator<WebElement> iterator = links.iterator();

       while (iterator.hasNext()) {
            WebElement link = iterator.next();
            System.out.println(link.getText());  
       }
    }

    @Test (enabled = false)
    // To get table text in row 3 and column 2
    public void selectTable() {

        WebElement tables = driver.findElement(By.xpath("//a[@href='/tables']"));
        //driver.findElement(By.cssSelector("a[href='/tables']"));
        tables.click();

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        Iterator<WebElement> itrows = rows.iterator();

        int rowcount =1;

        while (itrows.hasNext()) {
            WebElement row = itrows.next();
            List<WebElement> columnss = row.findElements(By.tagName("td"));
            Iterator<WebElement> itcolumns = columnss.iterator();
            int coloumncount =1;

            while(itcolumns.hasNext()){
                WebElement column = itcolumns.next();

                if(rowcount==2 && coloumncount==2){
                    System.out.println("Value: " + column.getText());
                }
                coloumncount++;
            }
            rowcount++;
        }
    }

    @Test (priority = 1, groups = "smoke", dependsOnMethods = "openBrowser", enabled = false)
    // Selecting Dropdown
    public void dropdown(){
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();;

        WebElement wb = driver.findElement(By.id("dropdown"));
        

        Select sl = new Select(wb);

        sl.selectByIndex(1);
        //sl.selectByValue("Option 2");


        List<WebElement> dropdowns =  sl.getOptions();

        for(WebElement option: dropdowns){
            System.out.println(option.getText());
        }
    }

    @Test (enabled = false)
    // Fetching today's date and Time, Week of Year
    public void DateandTime(){
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        LocalDate d = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatted = d.format(formatter);
        System.out.println(formatted);

        int weekofyear = d.get(WeekFields.of(Locale.getDefault()).weekOfYear());
        System.out.println(weekofyear);

    }

    @Test (groups = "smoke", enabled = false)
    public void mouseHoverAndKeyBoards(){
        WebElement wb = driver.findElement(By.xpath("//a[@href='/hovers']"));
        wb.click();
        WebElement image = driver.findElement(By.xpath("(//div[@class='figure'])[3]"));
        Actions action = new Actions(driver);
        action.moveToElement(image).perform();

        // Drag anD Drop

        // WebElement source = driver.findElement(By.id("column-a"));
        // WebElement target = driver.findElement(By.id("column-b"));

        // Actions actions = new Actions(driver);
        // actions.dragAndDrop(source, target).perform();

        // Send Keys

       // actions.sendKeys(Keys.ENTER).perform();
       // actions.sendKeys(Keys.TAB/COMMAND/CONTROL).perform();


       // CTRL +A
        //    actions.keyDown(Keys.CONTROL)
        //    .sendKeys("a")
        //    .keyUp(Keys.CONTROL)
        //    .perform();


    }

    @Test (groups = "smoke")
    // Adding a item which is more than rs 500 to cart
    public void additems(){
        // String s = driver.getTitle();
        // System.out.println(s);
        driver.findElement(By.xpath("//a[@href='/products']")).click();
        List<WebElement> wb = driver.findElements(By.xpath("//div[@class='productinfo text-center']"));

        for(WebElement product: wb){
            String pricetext = product.findElement(By.tagName("h2")).getText();
            int price = Integer.parseInt(pricetext.replace("Rs. ", ""));

            if(price>500){
                product.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
                System.out.println("Added product with price: Rs " + price);
                break;
                //driver.findElement(By.xpath("//button[contains(text(),'Continue Shopping')]")).click();
            }
        }
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }  
}
