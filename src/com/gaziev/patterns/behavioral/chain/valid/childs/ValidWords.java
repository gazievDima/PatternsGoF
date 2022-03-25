package com.gaziev.patterns.behavioral.chain.valid.childs;

import com.gaziev.patterns.behavioral.chain.valid.CheckAuthorization;

//проверка на допустимые знаки в полях
public class ValidWords extends CheckAuthorization {

    @Override
    public boolean check(String login, String password) {
        if (checkLogin(login) && checkPassword(password)) {
            System.out.println("valid words: SUCCESS.");
            if (nextCheck != null) {
                nextCheck.check(login, password);
            }
            return true;
        } else {
            System.out.println("valid words: FAILED.");
            return false;
        }
    }

    @Override
    public boolean checkLogin(String login) {
        if (login.contains("!")) {
            return false;
        } else if (login.contains("@")) {
            return false;
        } else if (login.contains("#")) {
            return false;
        } else if (login.contains("$")) {
            return false;
        } else if (login.contains("%")) {
            return false;
        }
        return true;
    }

    @Override
    public boolean checkPassword(String password) {
        if (password.contains("!")) {
            return false;
        } else if (password.contains("@")) {
            return false;
        } else if (password.contains("#")) {
            return false;
        } else if (password.contains("$")) {
            return false;
        } else if (password.contains("%")) {
            return false;
        }
        return true;
    }
}
