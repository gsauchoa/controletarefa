package com.mastertech.controletarefas.web.dto;

import com.mastertech.controletarefas.persistence.Task;

public class TaskPayload {
    private int id;
    private String name;
    private String status;

    public TaskPayload(){}

    public TaskPayload(Task task){
        id = task.getId();
        name = task.getName();
        status = task.getStatus();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Task buildEntity(){
        Task task = new Task();
        task.setId(id);
        task.setName(name);
        task.setStatus(status);

        return task;
    }
}
