package core;

import models.Task;

public class TaskManagerImpl implements TaskManager {
    @Override
    public void addTask(Task task) {

    }

    @Override
    public boolean contains(Task task) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Task getTask(String taskId) {
        return null;
    }

    @Override
    public void deleteTask(String taskId) {

    }

    @Override
    public Task executeTask() {
        return null;
    }

    @Override
    public void rescheduleTask(String taskId) {

    }

    @Override
    public Iterable<Task> getDomainTasks(String domain) {
        return null;
    }

    @Override
    public Iterable<Task> getTasksInEETRange(int lowerBound, int upperBound) {
        return null;
    }

    @Override
    public Iterable<Task> getAllTasksOrderedByEETThenByName() {
        return null;
    }
}
