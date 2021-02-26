import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class Nasa {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jopul\\Downloads\\Brand\\chromedriver.exe");
        //Creamos una nueva instancia
        WebDriver driver = new ChromeDriver();
        //Hacemos una llamada la página
        driver.get("https://mx.indeed.com/?r=us");
        submitForm(driver);
        assertEquals("Últimos 34 días",getRange(driver));

        //file.sendKeys(Keys.ENTER);

    }

    public static void submitForm(WebDriver driver){
        driver.findElement(By.id("text-input-what")).sendKeys("Software");
        driver.findElement(By.id("text-input-where")).sendKeys("México");
        driver.findElement(By.cssSelector("button.icl-Button--md")).click();
       //Nueva
        waitForNextPage(driver);
        driver.findElement(By.xpath("//*[@id=\"filter-dateposted\"]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"filter-dateposted-menu\"]/li[2]/a")).click();





    }

    public static void waitForNextPage(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,5);
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"filter-dateposted\"]/button")));

    }

    public static String getRange(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"filter-dateposted\"]/button")).getText();
    }
}
