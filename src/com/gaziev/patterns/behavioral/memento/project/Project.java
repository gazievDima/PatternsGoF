package com.gaziev.patterns.behavioral.memento.project;

public interface Project {
    void updateCode(String info);
    Project clone();
}
