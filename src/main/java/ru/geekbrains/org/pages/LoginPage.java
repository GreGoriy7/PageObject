package ru.geekbrains.org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.org.views.BaseView;

public class LoginPage extends BaseView {
    @FindBy(css = "input[id=prependedInput]")
    private WebElement inputLogin;

    @FindBy(css = "input[id=prependedInput2]")
    private WebElement inputPassword;

    @FindBy(css = "button[id=_submit]")
    private WebElement buttonSignIn;
    private CharSequence login;


    public LoginPage(WebDriver driver){super(driver);}

    @Override
    public void CheckUrl(Object baseUrl) {

    }

    public LoginPage enterLogin(String login){
        inputLogin.sendKeys(login);
        return this;
    }
    public LoginPage enterPassword(String login){
        CharSequence password = "Student2020!";
        inputLogin.sendKeys(password);
        return this;
}
public HomePage clickLoginButton(){
    buttonSignIn.click();
    return new HomePage(driver);
    }
    public HomePage authoriseScenario (String Login, String password){
        inputLogin.sendKeys(login);
inputPassword.sendKeys(password);
buttonSignIn.click();
return new HomePage(driver);

    }
}
