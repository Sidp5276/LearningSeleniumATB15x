package com.thetestingacademy;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium02 {
    public static void main(String[] args) {
       ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com");
    }
}
