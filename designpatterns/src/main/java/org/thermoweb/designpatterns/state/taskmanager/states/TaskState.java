package org.thermoweb.designpatterns.state.taskmanager.states;

import org.thermoweb.designpatterns.state.taskmanager.Task;

public sealed interface TaskState permits Created, Finished, Prepared {
    void execute(Task task);
    void prepare(Task task);
}
