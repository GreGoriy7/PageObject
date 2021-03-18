package ru.geekbrains.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class TestDZ {
    private static final String LOGIN_PAGE_URL = "https://crm.geekbrains.space/user/login";
    private static final String STUDENT_LOGIN = "Applanatest";
    private static final String STUDENT_PASSWORD = "STUDENT2020!";
    private static final WebDriver driver;

    static{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        login();
        // Навести курсор на вкладку "Проекты"
        driver.findElement(By.xpath("//html/body/div[2]/div/header/div[2]/ul/li[3]/a/span")).click();

        //Нажать на вкладку "Мои Проекты"
        driver.findElement(By.xpath("//html/body/div[2]/div/header/div[2]/ul/li[3]/ul/li[4]/a/span")).click();

        //Нажать на кнопку "Создать проект"
        driver.findElement(By.linkText("linkText=Создать проект")).click();


    }

    private static void login() {
        driver.get(LOGIN_PAGE_URL);
        WebElement loginTextInput = driver.findElement(By.cssSelector("input[id=prependedInput]"));
        loginTextInput.sendKeys(STUDENT_LOGIN);
        WebElement passwordTextInput = driver.findElement(By.cssSelector("input[id=prependedInput2]"));
        passwordTextInput.sendKeys(STUDENT_PASSWORD);
        WebElement loginButton = driver.findElement(By.cssSelector("button[id=_submit]"));
        loginButton.click();
    }
}

