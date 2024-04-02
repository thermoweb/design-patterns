package org.thermoweb.designpatterns.state.taskmanager.states;

import org.thermoweb.designpatterns.state.taskmanager.Task;
import org.thermoweb.designpatterns.state.taskmanager.TaskException;

public sealed interface TaskState permits Created, Finished, Prepared {
    void execute(Task task) throws TaskException;
    void prepare(Task task) throws TaskException;
}
