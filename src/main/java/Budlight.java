import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Budlight {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jopul\\Downloads\\Brand\\chromedriver.exe");
        //Creamos una nueva instancia
        WebDriver driver = new ChromeDriver();
        //Hacemos una llamada la página
        driver.get("https://www.budlight.com/");
        //Botó camarita
        WebElement input_month = driver.findElement(By.id("mnth"));
        input_month.sendKeys("05");
        WebElement input_day = driver.findElement(By.id("dy"));
        input_day.sendKeys("20");
        WebElement input_year = driver.findElement(By.id("yr"));
        input_year.sendKeys("1999");

        WebElement enter = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div[2]/div/form[2]/div[2]/div/button"));
        enter.click();

        //Home
        WebElement go_reg = driver.findElement(By.xpath("//*[@id=\"home-masthead-budlight-legends-1\"]/div/a"));
        go_reg.click();

        //Subir archivo


        //file.sendKeys(Keys.ENTER);
        //driver.quit();
    }
}
