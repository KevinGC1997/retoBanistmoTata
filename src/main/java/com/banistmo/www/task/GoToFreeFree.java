package com.banistmo.www.task;

import com.banistmo.www.interactions.SwitchToNewTab;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.banistmo.www.ui.ButtonPageBanistmo.*;

public class GoToFreeFree implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_UNDERSTOOD),
                Click.on(BTN_SERVICE_PRODUCT),
                Click.on(BTN_LOANS),
                Scroll.to(LBL_CAR_LOAN),
                Click.on(LBL_CAR_LOAN),
                Scroll.to(BTN_RATE_FEES),
                Click.on(BTN_RATE_FEES),
                Click.on(BTN_PDF),
                SwitchToNewTab.change()
        );
    }

    public static GoToFreeFree onThesite(){
        return Instrumented.instanceOf(GoToFreeFree.class).withProperties();
    }
}
