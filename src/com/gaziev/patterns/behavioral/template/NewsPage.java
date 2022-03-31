package com.gaziev.patterns.behavioral.template;

public class NewsPage extends WebSite{

    public NewsPage(String header) {
        super(header);
    }

    @Override
    void showContent() {
        System.out.println("== NEWS ==");
    }
}
