package ex01_Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01 {
    public static void main(String[] args) throws InterruptedException {
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://chrome.com");
    Thread.sleep(1000);
    driver.manage().window().maximize();
    driver.quit();
    }
}
