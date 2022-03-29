package com.gaziev.patterns.behavioral.mediator;

public class Button implements RadioButton{
    String name;
    boolean status;

    public Button(String name, boolean status) {
        this.name = name;
        this.status = status;
    }

    @Override
    public void setChecked() {
        status = true;
    }

    @Override
    public void setUnChecked() {
        status = false;
    }

    @Override
    public String getStatus() {
        if(status) return "Button: " + this.name + " checked";
        else return "Button: " + this.name + " unchecked";
    }
}
