package org.thermoweb.designpatterns.state.taskmanager;

import lombok.Getter;
import lombok.Setter;
import org.thermoweb.designpatterns.state.taskmanager.states.Created;
import org.thermoweb.designpatterns.state.taskmanager.states.TaskState;

@Getter
@Setter
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
        state.execute(this);
    }

    public void prepare() {
        state.prepare(this);
    }

    @Override
    public String toString() {
        return String.format("[%s]%s", state.getClass().getSimpleName(), name);
    }
}
