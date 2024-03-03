package core;

import model.Task;
import shared.Scheduler;

import java.util.*;
import java.util.stream.Collectors;

public class ProcessScheduler implements Scheduler {
    private List<Task> tasks;

    public ProcessScheduler() {
        this.tasks = new ArrayList<>();
    }

    @Override
    public void add(Task task) {
        this.tasks.add(task);
    }

    @Override
    public Task process() {
        if(this.tasks.size() == 0){
            return null;
        }

        return this.tasks.remove(0);
    }

    @Override
    public Task peek() {
        if(this.tasks.size() == 0){
            return null;
        }

        return this.tasks.get(0);
    }

    @Override
    public Boolean contains(Task task) {
        return this.tasks.contains(task);
    }

    @Override
    public int size() {
        return this.tasks.size();
    }

    @Override
    public Boolean remove(Task task) {
        if(!contains(task)){
            throw new IllegalArgumentException();
        }

        return this.tasks.remove(task);
    }

    @Override
    public Boolean remove(int id) {
        Task task = this.tasks.stream().filter(e -> e.getId() == id).findFirst().orElse(null);

        if(task == null){
            throw new IllegalArgumentException();
        }

        return this.tasks.remove(task);
    }

    @Override
    public void insertBefore(int id, Task task) {
        Task taskInList = this.tasks.stream().filter(e -> e.getId() == id).findFirst().orElse(null);

        if(taskInList == null){
            throw new IllegalArgumentException();
        }else{
            int index = this.tasks.indexOf(taskInList);
            this.tasks.add(index, task);
        }
    }

    @Override
    public void insertAfter(int id, Task task) {
        Task taskInList = this.tasks.stream().filter(e -> e.getId() == id).findFirst().orElse(null);

        if(taskInList == null){
            throw new IllegalArgumentException();
        }else if(this.tasks.indexOf(taskInList) + 1 < this.tasks.size()){
            this.tasks.add(tasks.indexOf(taskInList) + 1, task);
        }else{
            this.tasks.add(task);
        }
    }

    @Override
    public void clear() {
        this.tasks.clear();
    }

    @Override
    public Task[] toArray() {
        return this.tasks.toArray(new Task[0]);
    }

    @Override
    public void reschedule(Task first, Task second) {
        if(!this.tasks.contains(first) || !this.tasks.contains(second)){
            throw new IllegalArgumentException();
        }else{
            int i1 = this.tasks.indexOf(first);
            int i2 = this.tasks.indexOf(second);

            Collections.swap(this.tasks, i1, i2);
        }
    }

    @Override
    public List<Task> toList() {
        return new ArrayList<>(this.tasks);
    }

    @Override
    public void reverse() {
        Collections.reverse(this.tasks);
    }

    @Override
    public Task find(int id) {
        Task task = this.tasks.stream().filter(e -> e.getId() == id).findFirst().orElse(null);

        if(task == null){
            throw new IllegalArgumentException();
        }

        return task;
    }

    @Override
    public Task find(Task task) {
        if(!contains(task)){
            throw new IllegalArgumentException();
        }

        int i = this.tasks.indexOf(task);

        return this.tasks.get(i);
    }

    private int getIndex(int id) {
        int index = -1;
        
        for (int i = 0; i < this.tasks.size(); i++) {
            if (this.tasks.get(i).getId() == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            throw new IllegalArgumentException();
        }

        return index;
    }
}
