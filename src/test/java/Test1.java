import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Test1 {
    @Test
    public void test11(){
        WebDriver driver = new HtmlUnitDriver();
        driver.get("https://www.gmail.com");
        System.out.println("Page Title :" + driver.getTitle());
        driver.close();
    }
}
