package com.gaziev.patterns.behavioral.memento.project;

public class AndroidProject implements Project {
    private final String name;
    private String codeBase = "code base is empty.";

    public AndroidProject(String name) {
        this.name = name;
    }

    @Override
    public void updateCode(String code) {
        this.codeBase = code;
    }

    @Override
    public String toString() {
        return name + " = " + codeBase;
    }

    @Override
    public AndroidProject clone() {
        AndroidProject o = new AndroidProject(name);
        o.updateCode(codeBase);
        return o;
    }

}
