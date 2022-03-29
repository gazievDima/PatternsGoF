package com.gaziev.patterns.behavioral.mediator;

public class ButtonMediator implements Mediator {
    RadioButton[] arrButtons;

    public ButtonMediator(RadioButton[] arrButtons) {
        this.arrButtons = arrButtons;
    }

    @Override
    public void select(RadioButton button) {
        for(RadioButton btn : arrButtons) {
            if(button == btn) {
                button.setChecked();
                System.out.println(button.getStatus());
            } else {
                btn.setUnChecked();
                System.out.println(btn.getStatus());
            }
        }
    }
}
