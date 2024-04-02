package org.thermoweb.designpatterns.state.taskmanager.states;

import lombok.extern.slf4j.Slf4j;
import org.thermoweb.designpatterns.state.taskmanager.Task;
import org.thermoweb.designpatterns.state.taskmanager.TaskException;

@Slf4j
public final class Created implements TaskState {
    @Override
    public void execute(Task task) throws TaskException {
        throw new TaskException("Unprepared task can't be executed");
    }

    @Override
    public void prepare(Task task) {
        log.atInfo().log("preparing task '{}'", task);
        task.setState(new Prepared());
        log.atInfo().log("Task '{}' prepared", task);
    }
}
