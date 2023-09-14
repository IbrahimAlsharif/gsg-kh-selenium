import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
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
import java.util.Set;

import static java.lang.Thread.sleep;

public class HomePageTest {
WebElement loginButton, gmailButton;

@Test(priority  =1)
    public void verifyLoginButtonIsDisplayed(){
    Assert.assertTrue(HomePage.getLoginButton().isDisplayed());
}
@Test(priority  =2)
    public void verifyLoginButtonTextIsCorrect(){
    Assert.assertEquals(loginButton.getText(),"تسجيل الدخول");
}
@Test(priority  =3)
    public void verifyGmailButtonIsDisplayed(){
     gmailButton = Setup.driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a"));
    Assert.assertTrue(gmailButton.isDisplayed());
}
@Test(priority  =4)
    public void verifyGmailButtonTextIsCorrect(){
    Assert.assertEquals(gmailButton.getText(), "Gmail");
}
@Test(priority = 5)
    public void verifyClickingLoginButtonOpensSignInPage(){
    loginButton.click();
    WebElement pageTitle = Setup.driver.findElement(By.xpath("//*[@id=\"headingText\"]"));
    Assert.assertTrue(pageTitle.isDisplayed());
}



}
