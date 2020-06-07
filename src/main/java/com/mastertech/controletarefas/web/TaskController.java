package com.mastertech.controletarefas.web;

import com.mastertech.controletarefas.persistence.Task;
import com.mastertech.controletarefas.service.TaskService;
import com.mastertech.controletarefas.web.dto.TaskPayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/projeto/{projectId}/tarefa")
    public List<TaskPayload> getAllByProject(@PathVariable int projectId){
        List<TaskPayload> responses = new ArrayList<>();

        for(Task task : taskService.getAllByProject(projectId)){
            responses.add(new TaskPayload(task));
        }

        return responses;
    }

    @PostMapping("/projeto/{projectId}/tarefa")
    public TaskPayload create(@PathVariable int projectId, @RequestBody TaskPayload payload) {
        Task task = payload.buildEntity();
        task.setProjectById(projectId);

        return new TaskPayload(taskService.create(task));
    }
}
