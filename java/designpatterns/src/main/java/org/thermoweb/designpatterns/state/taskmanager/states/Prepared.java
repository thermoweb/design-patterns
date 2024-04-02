package org.thermoweb.designpatterns.state.taskmanager.states;

import lombok.extern.slf4j.Slf4j;
import org.thermoweb.designpatterns.state.taskmanager.Task;
import org.thermoweb.designpatterns.state.taskmanager.TaskException;

@Slf4j
public final class Prepared implements TaskState {
    @Override
    public void execute(Task task) {
        log.atInfo().log("executing task '{}'", task);
        task.setState(new Finished());
        log.atInfo().log("Task '{}' executed", task);
    }

    @Override
    public void prepare(Task task) throws TaskException {
        throw new TaskException(String.format("Task '%s' already prepared.", task));
    }
}
