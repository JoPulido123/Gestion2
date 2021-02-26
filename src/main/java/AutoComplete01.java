import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class AutoComplete01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jopul\\Downloads\\Brand\\chromedriver.exe");
        //Creamos una nueva instancia
        WebDriver driver = new ChromeDriver();
        //Hacemos una llamada la página
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        //Seleccionamos los elementos con los que interactúa el programa (NewTab y alertbotón).
        // WebElement elementTab = driver.findElement(By.id("new-tab-button"));

         WebElement inputAC = driver.findElement(By.id("autocomplete"));
         inputAC.sendKeys("Avenida Tercera de Periférico 200, Luis Encinas, Hermosillo, Sonora, México");
         sleep(1000);
         WebElement resultAC = driver.findElement(By.className("pac-item"));
         resultAC.click();
        //Hacemos click al botón
        //Alerta y aceptar

        //Cerramos el navegador
         driver.quit();
    }
}

