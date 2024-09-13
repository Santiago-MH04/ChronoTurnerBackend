package org.springboot.riwi.chronoturner.backend.services.entityServices;

import org.springboot.riwi.chronoturner.backend.dtos.request.TaskRequestDTO;
import org.springboot.riwi.chronoturner.backend.entities.Task;
import org.springboot.riwi.chronoturner.backend.services.methodServices.RemoveService;
import org.springboot.riwi.chronoturner.backend.services.methodServices.SaveService;
import org.springboot.riwi.chronoturner.backend.services.methodServices.UpdateService;
import org.springboot.riwi.chronoturner.backend.services.methodServices.ReadByIdService;

public interface TaskService extends ReadByIdService<String, Task>,
                                     /*SaveService<Task, TaskRequestDTO>,*/ //Favor corregir mañana con inmediatez
                                     UpdateService<Task>,
                                     RemoveService<String> {
    //Atributos de TaskService
    //Constructores de TaskService
    //Asignadores de atributos de TaskService (setters)
    //Lectores de atributos de TaskService (getters)
    //Métodos de TaskService
}
