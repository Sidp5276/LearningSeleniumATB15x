package ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetVsNavigate {
    public static void main(String[] args)throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // Navigation
        driver.get("https://app.vwo.com");
        Thread.sleep(1000);
        // Navigation #2
        driver.navigate().to("https://thetestingacademy.com");
        driver.navigate().back();
        driver.navigate().forward();

        System.out.println(driver.getTitle());

        driver.quit();
    }
}