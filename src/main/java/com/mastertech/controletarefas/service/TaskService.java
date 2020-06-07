package com.mastertech.controletarefas.service;

import com.mastertech.controletarefas.persistence.Task;
import com.mastertech.controletarefas.persistence.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllByProject(int projectId){
        return taskRepository.findAllByProjectId(projectId);
    }

    public Task create(Task task){
        return taskRepository.save(task);
    }
}
