import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ejercicio03 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jopul\\Downloads\\Brand\\chromedriver.exe");
        //Creamos una nueva instancia
        WebDriver driver = new ChromeDriver();
        //Hacemos una llamada la página
        driver.get("https://formy-project.herokuapp.com/switch-window");
        //Seleccionamos los elementos con los que interactúa el programa (NewTab y alertbotón).
       // WebElement elementTab = driver.findElement(By.id("new-tab-button"));

        WebElement alertButton = driver.findElement(By.id("alert-button"));
        //Hacemos click al botón
        alertButton.click();
       //Alerta y aceptar
        driver.switchTo().alert().accept();
        //Cerramos el navegador
        //driver.quit();
    }
}