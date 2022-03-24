package com.gaziev.patterns.structural.flyweight;

import java.util.List;

public class Project {
    List<Developer> developerList;

    public Project(List<Developer> developerList) {
        this.developerList = developerList;
    }

    public void startProject() {
        for(Developer developer : developerList) {
            developer.doWork();
        }
    }
}
