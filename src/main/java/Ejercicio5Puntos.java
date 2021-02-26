import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;


public class Ejercicio5Puntos {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jopul\\Downloads\\Brand\\chromedriver.exe");
        //Creamos una nueva instancia
        WebDriver driver = new ChromeDriver();
        //Entra a la página seleccionada
        driver.get("https://es-l.airbnb.com/");


       //Insertar información
        WebElement destino = driver.findElement(By.id("bigsearch-query-detached-query"));
        destino.click();
        destino.sendKeys("Sadirac");
        destino.sendKeys(Keys.ENTER);


        //Seleccionar Datepicker fecha de llegada y salida
        WebElement fechaI = driver.findElement(By.className("_12fun97"));
        fechaI.click();

        WebElement fechaS = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[1]/div[1]/div/header/div/div[2]/div[2]/div/div/div/form/div/div/div[3]/div[4]/section/div/div/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[4]/td[4]"));
        fechaS.click();

        //Botones
        WebElement huespedes = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[1]/div[1]/div/header/div/div[2]/div[2]/div/div/div/form/div/div/div[5]/div[1]/div"));
        huespedes.click();

        WebElement numero = driver.findElement(By.xpath("//*[@id=\"stepper-adults\"]/button[2]"));
        numero.click();


        //Buscar destinos con toda la información seleccionada
        WebElement buscar = driver.findElement(By.className("_w64aej"));
        buscar.click();
        //Cerramos el navegador
        //driver.quit();
    }
}
