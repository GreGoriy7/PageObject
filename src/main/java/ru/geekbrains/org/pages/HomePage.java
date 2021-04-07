package ru.geekbrains.org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.org.views.BaseView;

public class HomePage extends BaseView {
    @FindBy(xpath = "xpath=//a[@title='Создать контактное лицо']")
    private WebElement buttonSignIn;

    @FindBy(xpath = "xpath=//div/div/div[2]/input")
    private WebElement inputSurname;

    @FindBy(xpath = "xpath=//div/div[2]/div[2]/input")
    private WebElement inputName;

    @FindBy(xpath = "xpath=//div[2]/div/div/a/span")
    private WebElement inputJob;

    @FindBy(xpath = "xpath=//div[2]/div[2]/div[2]/input")
    private WebElement inputCheckBox;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void CheckUrl(Object baseUrl) {

    }
}

