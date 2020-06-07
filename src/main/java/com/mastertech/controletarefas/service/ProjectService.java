package com.mastertech.controletarefas.service;

import com.mastertech.controletarefas.persistence.Project;
import com.mastertech.controletarefas.persistence.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAll(){
        return projectRepository.findAll();
    }

    public Project create(Project project){
        return projectRepository.save(project);
    }
}
