package com.gaziev.patterns.behavioral.chain.valid.childs;

import com.gaziev.patterns.behavioral.chain.User;
import com.gaziev.patterns.behavioral.chain.valid.CheckAuthorization;

//проверка логирования пользователя на сервере
public class ValidUser extends CheckAuthorization {

    User user = new User("dima", "12345");

    @Override
    public boolean check(String login, String password) {
        if(checkLogin(login) && checkPassword(password)) {
            System.out.println("valid user: SUCCESS.");
            if(nextCheck != null) {
                nextCheck.check(login, password);
            }
            return true;
        } else {
            System.out.println("valid user: FAILED.");
            return false;
        }
    }

    @Override
    public boolean checkLogin(String login) {
        if(login.equals(user.getLogin())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkPassword(String password) {
        if(password.equals(user.getPassword())) {
            return true;
        } else {
            return false;
        }
    }
}
