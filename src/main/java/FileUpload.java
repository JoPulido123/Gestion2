import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileUpload {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jopul\\Downloads\\Brand\\chromedriver.exe");
        //Creamos una nueva instancia
        WebDriver driver = new ChromeDriver();
        //Hacemos una llamada la página
        driver.get("https://images.google.com/");
        //Botó camarita
        WebElement cam_button = driver.findElement(By.xpath("//*[@id=\"sbtc\"]/div/div[3]/div[2]"));
        cam_button.click();
        //Pestañita
        WebElement upload = driver.findElement(By.xpath("//*[@id=\"dRSWfb\"]/div/a"));
        upload.click();

        //Subir archivo
        WebElement file = driver.findElement(By.xpath("//*[@id=\"awyMjb\"]"));
        //file.click();
        file.sendKeys("C:\\Users\\jopul\\IdeaProjects\\Ejercicio02\\src\\test\\Cuchau.jpeg");
        //file.sendKeys(Keys.ENTER);
        //driver.quit();
    }
}