
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowserTest {
    WebDriver driver;

    @BeforeMethod
    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }

    @Test (enabled = false)
    //
    public void openBrowser() {

       List<WebElement> links= driver.findElements(By.tagName("a"));
       System.out.println("Total Links:" + links.size());

       Iterator<WebElement> iterator = links.iterator();

       while (iterator.hasNext()) {
            WebElement link = iterator.next();
            System.out.println(link.getText());  
       }
    }

    @Test
    public void selectTable() {

        WebElement tables = driver.findElement(By.xpath("//a[@href='/tables']"));
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

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }  
}
