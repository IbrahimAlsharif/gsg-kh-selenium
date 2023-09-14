import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
    public static WebElement getLoginButton(){
       return Setup.driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a"));
    }
}
