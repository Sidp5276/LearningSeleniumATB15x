package com.thetestingacademy.TASK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2 {

    @Test
    public void TTA_Bank() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://tta-bank-digital-973242068062.us-west1.run.app/");
        driver.manage().window().maximize();
        //sign up
        WebElement BtnSignUp = driver.findElement(By.xpath("//button[text()='Sign Up']"));
        BtnSignUp.click();

        //sign
        WebElement InbxFullname = driver.findElement(By.xpath("//input[@type='text']"));
        InbxFullname.sendKeys("sid");
        WebElement InbxEmail = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        InbxEmail.sendKeys("sid5276@sid.com");
        WebElement InbxPassword = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        InbxPassword.sendKeys("pass123");
        Thread.sleep(2000);
        WebElement BtnCreateAccount = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        BtnCreateAccount.click();

        Thread.sleep(5000);

        //click on Transfer Funds btn
        driver.findElement(By.xpath("//button[text()=\"Transfer Funds\"]")).click();

        //enter 5000 in Amount inputbox
        WebElement AmountInbx=driver.findElement(By.xpath("//input[@placeholder=\"0.00\"]"));
        AmountInbx.sendKeys("5000");
        WebElement ContinueBtn=driver.findElement(By.xpath("//button[text()='Continue']"));
        ContinueBtn.click();
        WebElement ConfirmBtn=driver.findElement(By.xpath("//button[contains(text(),\"Confirm Transfer\")]"));
        ConfirmBtn.click();
        Thread.sleep(5000);

        //Navigate back to dashboard
        WebElement DashboardBtn=driver.findElement(By.xpath("//button[contains(text(),\"Dashboard\")]"));
        DashboardBtn.click();
        Thread.sleep(5000);

        //validate Total Balance= 45000
        WebElement TotalBalance=driver.findElement(By.xpath("//h3[@class=\"mt-2 text-3xl font-bold\"]"));
        Assert.assertEquals(TotalBalance.getText(),"$45,000.00");

        driver.quit();
    }
}
