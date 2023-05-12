package org.thermoweb.designpatterns.state.taskmanager;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.thermoweb.designpatterns.state.taskmanager.states.Created;
import org.thermoweb.designpatterns.state.taskmanager.states.TaskState;

@Getter
@Setter
@Slf4j
public class Task {

    private TaskState state;
    private final String name;

    public Task(String name) {
        this.name = name;
        state = new Created();
    }

    public String getName() {
        return name;
    }

    public void setState(TaskState state) {
        this.state = state;
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
