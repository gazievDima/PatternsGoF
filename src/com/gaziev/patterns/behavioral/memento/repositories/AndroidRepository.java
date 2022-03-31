package com.gaziev.patterns.behavioral.memento.repositories;


import com.gaziev.patterns.behavioral.memento.project.Project;

public class AndroidRepository implements Memento {
    Project project;

    @Override
    public void save(Project project) {
        System.out.println(project + "is saved to repository.");
        this.project = project;
    }

    @Override
    public Project load() {
        if(project != null) {
            System.out.println(project + " restored.");
            return this.project;
        } else {
            System.out.println("Repository is empty.");
            return null;
        }

    }
}
