package com.gaziev.patterns.behavioral.memento.repositories;

import com.gaziev.patterns.behavioral.memento.project.Project;

public interface Memento {
    void save(Project project);
    Project load();
}
