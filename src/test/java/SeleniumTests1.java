import org.openqa.selenium.WebDriver;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class SeleniumTests1 {

    public static void main(String[] args) {
        WebDriver driver = new HtmlUnitDriver();
        driver.get("https://www.gmail.com");
        System.out.println("Page Title :" + driver.getTitle());
        driver.close();
    }
}
