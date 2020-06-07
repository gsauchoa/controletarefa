package com.mastertech.controletarefas.web;

import com.mastertech.controletarefas.persistence.Project;
import com.mastertech.controletarefas.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projeto")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping
    public List<Project> getAll(){
        return projectService.getAll();
    }

    @PostMapping
    public Project create(@RequestBody Project project){
        return projectService.create(project);
    }
}
