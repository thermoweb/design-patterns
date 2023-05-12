package org.thermoweb.designpatterns.state.taskmanager.states;

import lombok.extern.slf4j.Slf4j;
import org.thermoweb.designpatterns.state.taskmanager.Task;

@Slf4j
public final class Created implements TaskState {
    @Override
    public void execute(Task task) {
        log.atInfo().log("Unprepared task can't be executed", task);
    }

    @Override
    public void prepare(Task task) {
        task.setState(new Prepared());
        log.atInfo().log("Task '{}' prepared", task);
    }
}
