package org.thermoweb.designpatterns.state.taskmanager.states;

import lombok.extern.slf4j.Slf4j;
import org.thermoweb.designpatterns.state.taskmanager.Task;

@Slf4j
public final class Prepared implements TaskState {
    @Override
    public void execute(Task task) {
        task.setState(new Finished());
        log.atInfo().log("Task '{}' executed", task);
    }

    @Override
    public void prepare(Task task) {
        log.atInfo().log("Task '{}' already prepared.", task);
    }
}
