package ru.geekbrains.org.BaseUITest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private static final Object BASE_URL = "https://crm/geekbrains.space" ;
    private static final Object LOGIN_PATH = "user/login";
    protected WebDriver driver;

    public BaseTest(WebDriver driver) {
    }

    @BeforeAll
    public static void setUp(){ WebDriverManager.chromedriver().setup();}

    @BeforeEach
    public void beforeTest(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
@AfterEach
    public void TearDown(){driver.quit();}
    }

