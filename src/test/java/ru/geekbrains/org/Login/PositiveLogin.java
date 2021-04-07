package ru.geekbrains.org.Login;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.org.BaseUITest.BaseTest;
import org.junit.jupiter.api.Test;
import ru.geekbrains.org.pages.HomePage;
import ru.geekbrains.org.pages.LoginPage;
import ru.geekbrains.org.views.BaseView;

public class PositiveLogin extends BaseView {
    private static final Object BASE_URL = "https://crm.geekbrains.space";
    private static final Object STUDENT_PASSWORD = "Student2020!";
    private static final Object STUDENT_LOGIN = "Applanatest";

    public PositiveLogin(WebDriver driver) {
        super(driver);
    }

    @Override
    public void CheckUrl(Object baseUrl) {

    }


    @Test

    public void LoginWithUserTest() {
        new LoginPage(driver)
              .enterLogin((String) STUDENT_LOGIN)
                .enterPassword((String) STUDENT_PASSWORD)
                .clickLoginButton()
                .CheckUrl(BASE_URL);
    }




}
