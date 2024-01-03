package com.banistmo.www.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ButtonPageBanistmo {

    public static final Target BTN_UNDERSTOOD = Target.the("button to accept conditions")
            .locatedBy("//button[@id='btn-aceptar-cookies']");
    public static final Target BTN_SERVICE_PRODUCT = Target.the("button to service and product")
            .locatedBy("//a[@class='dropdown-toggle']");
    public static final Target BTN_LOANS = Target.the("button to loan sections")
            .locatedBy("//*[contains(text(), 'Préstamos')]");
    public static final Target LBL_CAR_LOAN = Target.the("butto to car loan")
            .locatedBy("//*[contains(text(), 'Préstamos de Auto')]");
    public static final Target BTN_RATE_FEES = Target.the("button to rate and fees")
            .locatedBy("(//li[@class='none']/a)[3]");
    public static final Target BTN_PDF = Target.the("button to download this pdf")
            .locatedBy("(//a[@title='Guía para afiliación a compra'])[2]");

}
