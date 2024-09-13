package org.springboot.riwi.chronoturner.backend.services.serviceImplementations;

import org.springboot.riwi.chronoturner.backend.entities.Priority;
import org.springboot.riwi.chronoturner.backend.repositories.PriorityRepository;
import org.springboot.riwi.chronoturner.backend.services.entityServices.PriorityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriorityServiceImpl implements PriorityService {
        //Atributos de PriorityRepositoryImpl
    private PriorityRepository repoPriority;

    //Constructores de PriorityRepositoryImpl
    //Asignadores de atributos de PriorityRepositoryImpl (setters)
    //Lectores de atributos de PriorityRepositoryImpl (getters)
        //Métodos de PriorityRepositoryImpl
    @Override
    public List<Priority> readAll() {
        return this.repoPriority.findAll();
    }
    @Override
    public void remove(String id) {
        this.repoPriority.deleteById(id);
    }
}
