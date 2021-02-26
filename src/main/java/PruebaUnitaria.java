import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class PruebaUnitaria {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jopul\\Downloads\\Brand\\chromedriver.exe");
        //Creamos una nueva instancia
        WebDriver driver = new ChromeDriver();
        //Hacemos una llamada la página
        driver.get("https://formy-project.herokuapp.com/form");
        //Botó camarita
        driver.findElement(By.id("first-name")).sendKeys("José");
            driver.findElement(By.id("last-name")).sendKeys("Pulido");
        driver.findElement(By.id("job-title")).sendKeys("Student");
          //Radio-butoon
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-1")).click();


        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.findElement(By.cssSelector("option[value='1']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("05/20/1999");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn")).click();
        //Subir archivo

        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
        String alertText = alert.getText();
        assertEquals("Theeee form was successfully submitted!",alertText);

        //file.sendKeys(Keys.ENTER);
        //driver.quit();
    }
}
