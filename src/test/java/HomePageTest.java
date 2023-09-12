import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class HomePageTest {


@Test(priority = 2)
    public void test1(){
    System.out.println("Home Page test1");
    Assert.assertTrue(true);
}
@Test(priority = 1)
    public void test2(){
    System.out.println("Home Page test2");
    Assert.assertTrue(true);
}
@Test(priority = 2)
    public void test3(){
    System.out.println("Home page test3");
    Assert.assertTrue(true);
}




}
