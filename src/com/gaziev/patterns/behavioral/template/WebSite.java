package com.gaziev.patterns.behavioral.template;

public abstract class WebSite {
    String header;

    public WebSite(String header) {
        this.header = header;
    }

    public void showPage() {
        System.out.println("== " + header + " ==");
        showContent();
        System.out.println("== FOOTER ==");
    }

    abstract void showContent();
}
