package org.thermoweb.designpatterns.state.taskmanager;

import org.thermoweb.designpatterns.state.taskmanager.states.Created;
import org.thermoweb.designpatterns.state.taskmanager.states.TaskState;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Task {

    @Setter
    private TaskState state;
    @Getter
    private final String name;

    public Task(String name) {
        this.name = name;
        state = new Created();
    }

    public void execute() {
        try {
            state.execute(this);
        } catch (TaskException e) {
            log.atError().log("An error occurred during task execution : {}", e.getMessage());
        }
    }

    public void prepare() {
        try {
            state.prepare(this);
        } catch (TaskException e) {
            log.atError().log("An error occurred during task preparation : {}", e.getMessage());
        }
    }

    @Override
    public String toString() {
        return String.format("[%s]%s", state.getClass().getSimpleName(), name);
    }
}
