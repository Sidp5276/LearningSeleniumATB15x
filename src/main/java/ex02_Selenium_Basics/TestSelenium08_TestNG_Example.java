package ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium08_TestNG_Example  {

    @Test
    public void test_Selenium_app_vwo() throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        driver.quit();
    }
}
