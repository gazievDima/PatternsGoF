package com.gaziev.patterns.behavioral.chain.valid;

public abstract class CheckAuthorization {
    public CheckAuthorization nextCheck;

    public void setNextCheck(CheckAuthorization nextCheck) {
        this.nextCheck = nextCheck;
    }

    public abstract boolean check(String login, String password);
    public abstract boolean checkLogin(String login);
    public abstract boolean checkPassword(String password);
}
