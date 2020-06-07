package com.mastertech.controletarefas.persistence;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskRepository extends CrudRepository<Task, Integer> {
    List<Task> findAllByProjectId(int id);
}
