package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class MyF_Test {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start () {
        driver = new ChromeDriver(); //конструирование объекта (инициализация драйвера и браузера)
        wait = new WebDriverWait(driver,10);
    }

    @Test
    public void myFirstTest() {
        driver.get("https://yandex.ru");
        WebElement q = driver.findElement(By.id("text"));
        q.sendKeys("интерфакс");
        //driver.findElement(By.id("text")).sendKeys("интерфакс");
        driver.findElement(By.className("search2__button")).click();
    }

    /*@After
    public void stop() {
        driver.quit();
        driver = null;
    } */
}
