package com.gaziev.patterns.behavioral.strategy.projects;

import com.gaziev.patterns.behavioral.strategy.devs.Html;
import com.gaziev.patterns.behavioral.strategy.devs.Java;

import java.util.ArrayList;

public class ServerProject {
    ArrayList<Java> devs = new ArrayList<Java>();

    public void hiredDev(Java e) {
        devs.add(e);
    }

    public void doWork() {
        for(Java dev : devs) {
            dev.writeJavaCode();
        }
    }
}
