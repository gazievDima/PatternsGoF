package com.gaziev.patterns.behavioral.strategy.projects;

import com.gaziev.patterns.behavioral.strategy.devs.Html;
import com.gaziev.patterns.behavioral.strategy.devs.Java;

import java.util.ArrayList;

public class WebSiteProject {
    ArrayList<Html> devs = new ArrayList<Html>();

    public void hiredDev(Html e) {
        devs.add(e);
    }

    public void doWork() {
        for(Html dev : devs) {
            dev.writeHTMLCode();
        }
    }
}
