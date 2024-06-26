package org.thermoweb.designpatterns.state.taskmanager.states;

import org.thermoweb.designpatterns.state.taskmanager.Task;
import org.thermoweb.designpatterns.state.taskmanager.TaskException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class Finished implements TaskState {
    @Override
    public void execute(Task task) throws TaskException {
        throw new TaskException("Finished task can't be executed");
    }

    @Override
    public void prepare(Task task) throws TaskException {
        throw new TaskException("Finished task can't be prepared");
    }
}
