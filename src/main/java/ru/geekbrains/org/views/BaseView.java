package ru.geekbrains.org.views;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseView  {
    protected WebDriver driver;
    protected WebDriverWait wait20seconds;
    protected WebDriverWait wait30seconds;

    public BaseView(WebDriver driver){
        this.driver=driver;
        this.wait30seconds = new WebDriverWait(driver,30);
        this.wait20seconds = new WebDriverWait(driver,20);
        PageFactory.initElements(driver,this);
    }

    public abstract void CheckUrl(Object baseUrl);
}
