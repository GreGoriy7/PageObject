package ru.geekbrains.org;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import  java.util.concurrent.TimeUnit;





public class TestDZ {
    private static final String LOGIN_PAGE_URL = "https://crm.geekbrains.space/user/login";
    private static final String STUDENT_LOGIN = "Applanatest";
    private static final String STUDENT_PASSWORD = "Student2020!";
    private static final WebDriver driver;

    static{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        login();
        //Нажать на кропку "Создать контактное лицо"
        driver.findElement(By.xpath("xpath=//a[@title='Создать контактное лицо']")).click();

        //Ввести фамилию "Орехов"
        driver.findElement(By.xpath("xpath=//div/div/div[2]/input")).click();

        //Ввести имя "Григорий"
        driver.findElement(By.linkText("xpath=//div/div[2]/div[2]/input")).click();

        //Выбрать из списка название организации "Tesla.Co"
        driver.findElement(By.linkText("xpath=//div[2]/div/div/a/span")).click();

       //Ввести название должности "Тестировщик"
        driver.findElement(By.linkText("xpath=//div[2]/div[2]/div[2]/input")).click();




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

