import org.testng.annotations.BeforeClass;

public class TearDown {
    @BeforeClass
    public void tearDown(){
        Setup.driver.quit();
    }
}
