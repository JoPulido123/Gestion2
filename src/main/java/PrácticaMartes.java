import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrácticaMartes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jopul\\Downloads\\Brand\\chromedriver.exe");
        //Creamos una nueva instancia
        WebDriver driver = new ChromeDriver();
        //Entra a la página de la biblioteca de unison
        driver.get("http://www.bibliotecas.uson.mx/");

        //Seleccionamos los elementos con los que interactúa el programa (Input y botón)
        WebElement inputBusqueda = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBuscar"));
        //Buscar un libro por título: Java
        inputBusqueda.sendKeys("Java");
        //Damos click al botón de busqueda
        WebElement btnBusqueda = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnBuscar"));
        btnBusqueda.click();

        //Dar click en el primer libro que aparece y abrir la ficha.
        WebElement btnFicha = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridResultados_ctl00_ctl04_LinkButton1"));
        btnFicha.click();
        //Cerramos el navegador
        driver.quit();
    }
}
