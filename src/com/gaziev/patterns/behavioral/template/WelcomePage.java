package com.gaziev.patterns.behavioral.template;

public class WelcomePage extends WebSite {

    public WelcomePage(String header) {
        super(header);
    }

    @Override
    void showContent() {
        System.out.println("== WELCOME ==");
    }
}
