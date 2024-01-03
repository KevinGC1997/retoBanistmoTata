package com.banistmo.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.banistmo.www.util.WebDriverFactory.driver;

public class UrlPdf implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {

        return driver.getCurrentUrl();
    }
    public static UrlPdf was(){
        return new UrlPdf();
    }

}
