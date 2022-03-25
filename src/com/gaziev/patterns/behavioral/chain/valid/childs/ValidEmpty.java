package com.gaziev.patterns.behavioral.chain.valid.childs;

import com.gaziev.patterns.behavioral.chain.valid.CheckAuthorization;

//проверка на пустые поля в форме ввода
public class ValidEmpty extends CheckAuthorization {

    @Override
    public boolean check(String login, String password) {
        if(checkLogin(login) && checkPassword(password)) {
            System.out.println("valid empty: SUCCESS.");
            if(nextCheck != null) {
                nextCheck.check(login, password);
            }
            return true;
        } else {
            System.out.println("valid empty: FAILED.");
            return false;
        }
    }

    @Override
    public boolean checkLogin(String login) {
        return !login.isEmpty();
    }

    @Override
    public boolean checkPassword(String password) {
        return !password.isEmpty();
    }
}
