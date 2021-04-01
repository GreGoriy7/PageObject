package GB;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


class TestDZTest {
    private final String LOGIN_PAGE_URL = "https://crm.geekbrains.space/user/login";
    private final String STUDENT_LOGIN = "Applanatest";
    private final String STUDENT_PASSWORD = "Student2020!";
    private WebDriver driver;
    private JavascriptExecutor jsExecutor;

    @BeforeAll
    public static void setupWebDriverManager(){// настройка браузера
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    public void beforeTest(){
        setUpDriverSession();
        login(); // Авторизация по логину
    }

    private void login() {
    }

    private void setUpDriverSession() {
    }

    @AfterEach
    public void tearDown(){
        if (driver != null){
            driver.quit();
        }
        
    }




    @Test
    public void CreateContactPerson() {
//Нвести мыш на вкладку "Контрагенты"
        By btnLocator = By.xpath("xpath=//*[@id=\"main-menu\"]/ul/li[1]/a/span");
        Actions actions = new Actions(driver);
        WebElement menuBtn = driver.findElement(btnLocator);
        actions.moveToElement(menuBtn);

        //Открыть меню "Контактные лица"
        WebElement SubMenu = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/ul/li[4]/a/span"));
        actions.moveToElement(SubMenu);
        actions.click().build().perform();

        //Нажать на кнопку "Создать контактное лицо"
        driver.findElement(By.xpath("xpath=//a[@title='Создать контактное лицо']"));

        //Ожидаем перехода на страницу "Создать контактное лицо"
        WebDriverWait waitFiveSeconds = new WebDriverWait(driver, 5);
        waitFiveSeconds.until(ExpectedConditions.urlContains("/create"));

        //Заполнить поле "Фамилия"
        driver.findElement(By.xpath("xpath=//div/div/div[2]/input"));

        //Заполнить поле "Имя"
        driver.findElement(By.xpath("xpath=//div/div[2]/div[2]/input"));

        //Выюираю свою Организацию
        driver.findElement(By.xpath("xpath=//div[2]/div/div/a/span"));

        //Заполнить поле "Должность"
        driver.findElement(By.xpath("xpath=//div[2]/div[2]/div[2]/input"));

        //Нажать "Сохранить и закрыть"
        driver.findElement(By.cssSelector("button[class=btn btn-success action-button"));

//Добавление Assert
        WebElement element = driver.findElement(By.xpath("//div[@class='alert alert-success"));
        Assertions.assertTrue(element.isDisplayed());
        List<WebElement> message = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("//div[@class='alert alert-success fade in top message']")));
        Assertions.assertTrue(message.contains("Контактноье лицо сохранено"));
    }

}
