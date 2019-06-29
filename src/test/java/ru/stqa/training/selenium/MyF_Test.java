package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;


public class MyF_Test {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start () {
        driver = new ChromeDriver(); //конструирование объекта (инициализация драйвера и браузера)
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,4);
    }

    @Test
    public void myFirstTest() throws InterruptedException {
        driver.get("https://www.google.ru/");
        driver.findElement(By.cssSelector(".MiYK0e")).click();
        driver.findElement(By.id("K32")).click();
        driver.findElement(By.cssSelector(".MiYK0e")).click();
        
        driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("webdriwer");
        driver.findElement(By.className("gNO89b")).click();

        wait.until(titleIs("webdriwer - Поиск в Google"));
    }

    /*@After
    public void stop() {
        driver.quit();
        driver = null;
    } */
}
