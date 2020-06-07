package com.mastertech.controletarefas.persistence;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectRepository extends CrudRepository<Project, Integer> {
    List<Project> findAll();
}
