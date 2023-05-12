package org.thermoweb.designpatterns.state.taskmanager;

public class TaskManager {
    public static void main(String[] args) {
        Task task = new Task("tache 1");
        task.prepare();
        task.execute();

        task = new Task("nouvelle tache");
        task.execute();
        task.prepare();
        task.prepare();
        task.execute();
        task.prepare();
        task.execute();
    }
}
