package org.springboot.riwi.chronoturner.backend.services.serviceImplementations;

import org.springboot.riwi.chronoturner.backend.entities.Task;
import org.springboot.riwi.chronoturner.backend.repositories.TaskRepository;
import org.springboot.riwi.chronoturner.backend.services.entityServices.TaskService;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
        //Atributos de TaskRepositoryImpl
    private TaskRepository repoTask;
    //Constructores de TaskRepositoryImpl
    //Asignadores de atributos de TaskRepositoryImpl (setters)
    //Lectores de atributos de TaskRepositoryImpl (getters)
        //Métodos de TaskRepositoryImpl
    @Override
    public Task readById(String id) {
        return this.repoTask.findById(id).orElseThrow();
    }

    /*@Override
    public Task save(TaskRequestDTO entity) {
        return this.repoTask.save(entity);
    }*/

    @Override
    public void update(Task task) {
        this.repoTask.save(task);
    }
    @Override
    public void remove(String id) {
        this.repoTask.deleteById(id);
    }
}
