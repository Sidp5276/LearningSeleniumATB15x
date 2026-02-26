package ex01_Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium02 {
    public static void main(String[] args) {
       ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com");
    }
}
