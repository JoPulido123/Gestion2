import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jopul\\Downloads\\Brand\\chromedriver.exe");
        //Creamos una nueva instancia
        WebDriver driver = new ChromeDriver();
        //Hacemos una llamada la página
        driver.get("http://formy-project.herokuapp.com/keypress");
        //Seleccionamos los elementos con los que interactúa el programa (Input y botón).
        WebElement element = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        WebElement elementButton = driver.findElement(By.xpath("//*[@id=\"button\"]"));
        //Ingresamos el nombre
        element.sendKeys("Pulido Dávalos José Manuel");
        //Hacemos click al botón
        elementButton.click();
        //Cerramos el navegador
        driver.quit();
    }
}