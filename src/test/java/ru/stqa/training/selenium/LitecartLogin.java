package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LitecartLogin {
  private WebDriver driver;
  private WebDriverWait wait;

  @Before
  public void start() {
    ChromeOptions options = new ChromeOptions(); //объект опций командной строки
    options.addArguments("start-fullscreen");
//    driver = new ChromeDriver(options);
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability(ChromeOptions.CAPABILITY, options);
    driver = new ChromeDriver(caps);
    /*DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("unexpectedAlertBehaviour", "dismiss");
    driver = new InternetExplorerDriver(caps);*/

    System.out.println(((HasCapabilities) driver).getCapabilities());
//  driver = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
    wait = new WebDriverWait(driver, 10);
  }

  @Test
  public void litecartLoginTest() throws InterruptedException {
    driver.get("http://localhost/litecart/admin/");
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("login")).click();
    Thread.sleep(4000);
  }

  @After
  public void stop() {
    driver.quit();
    driver = null;
  }

}
